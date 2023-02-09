package com.shenyy.dp.state.example;

public class StopState implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StopState{}";
    }
}
