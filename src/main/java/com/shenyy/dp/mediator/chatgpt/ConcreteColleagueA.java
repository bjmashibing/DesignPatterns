package com.shenyy.dp.mediator.chatgpt;

public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("ColleagueA received: " + message);
    }
}
