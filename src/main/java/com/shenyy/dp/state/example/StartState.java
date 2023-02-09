package com.shenyy.dp.state.example;

public class StartState implements State{
    @Override
    public void handle(Context context) {
        System.out.println("Start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
