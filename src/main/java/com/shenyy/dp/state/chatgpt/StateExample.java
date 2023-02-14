package com.shenyy.dp.state.chatgpt;

public class StateExample {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.handle(context);//state.handle

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.handle(context);

        System.out.println(context.getState().toString());
    }
}
