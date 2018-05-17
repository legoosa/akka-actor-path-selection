package org.legoosa.tutorial.akka.actors;

import java.util.List;

import org.legoosa.tutorial.akka.vo.Employee;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class MasterActor extends AbstractActor{

	private LoggingAdapter logger = Logging.getLogger(this);

	private ActorRef childActor = null;
	private ActorRef sendMsg = null;

	@Override
	public void preStart() throws Exception {
		childActor = getContext().actorOf(Props.create(ChildActor.class), "child-actor");
		logger.info(childActor.path().toString());

		sendMsg = getContext().getSystem().actorOf(Props.create(SendMsgActor.class),"send-msg-actor");
		logger.info(sendMsg.path().toString());
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(String.class, msg -> {
					logger.info(msg);
				})
				.match(List.class, this::passEmployees)
				.build();
	}

	private void passEmployees(List<Employee> empList){
		for(Employee emp : empList){
			childActor.tell(emp, self());
		}
	}
}
