package org.legoosa.tutorial.akka.actors;

import org.legoosa.tutorial.akka.vo.Employee;

import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class ChildActor extends AbstractActor{

	private LoggingAdapter logger = Logging.getLogger(this);

	@Override
	public Receive createReceive() {
		return receiveBuilder()
				.match(Employee.class, emp -> {
					logger.info("name {} : "+emp.getName());
				})
				.build();
	}

}
