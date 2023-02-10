package com.shenyy.dp.templatemethod.chatgpt;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
