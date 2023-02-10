package com.shenyy.dp.templatemethod.chatgpt;

abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
