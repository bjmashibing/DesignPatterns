package com.shenyy.dp.builder.chatGPT;

public class BuilderExample {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                .meat("chicken")
                .bread("wheat")
                .cheese("cheese")
                .sauce("BBQ")
                .vegetables(new String[]{"tomato", "onion"})
                .build();

        System.out.println(burger);
    }
}
