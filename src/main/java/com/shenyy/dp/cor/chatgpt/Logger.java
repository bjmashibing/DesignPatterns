package com.shenyy.dp.cor.chatgpt;

abstract class Logger {
    //set the priority
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;

    // The next element in the chain of responsibility
    protected Logger next;

    public Logger setNext(Logger next) {
        this.next = next;
        return next;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }

        if (next != null) {
            next.message(msg, priority);
        }
    }

    protected abstract void writeMessage(String msg);
}
