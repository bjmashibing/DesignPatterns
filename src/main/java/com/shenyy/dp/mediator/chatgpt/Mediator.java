package com.shenyy.dp.mediator.chatgpt;

public interface Mediator {
    void send(String message, Colleague colleague);
}
