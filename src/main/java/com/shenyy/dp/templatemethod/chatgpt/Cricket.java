package com.shenyy.dp.templatemethod.chatgpt;

public class Cricket extends Game {
    private String name = "Cricket game";

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
