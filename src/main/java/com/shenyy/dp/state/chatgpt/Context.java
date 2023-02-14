package com.shenyy.dp.state.chatgpt;

public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
