package org.legoosa.tutorial.akka.actors;

import akka.actor.AbstractActor;

public class SendMsgActor extends AbstractActor{

	@Override
	public Receive createReceive() {

		return receiveBuilder()
				.match(String.class, msg -> {
					System.out.println(msg);
				})
				.build();
	}

}
