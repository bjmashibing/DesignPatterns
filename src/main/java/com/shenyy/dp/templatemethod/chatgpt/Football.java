package com.shenyy.dp.templatemethod.chatgpt;

public class Football extends Game{
    private String name = "Football game";

    @Override
    void initialize() {
        System.out.println(name + " initialize");
    }

    @Override
    void startPlay() {
        System.out.println(name + " start");
    }

    @Override
    void endPlay() {
        System.out.println(name + " end");
    }
}
