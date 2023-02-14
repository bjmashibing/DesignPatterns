package com.shenyy.dp.state.example01.thread;

public class TerminatedState extends ThreadState_ {
    private Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {

    }

    @Override
    void run() {

    }
}
