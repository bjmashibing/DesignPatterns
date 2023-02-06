package com.shenyy.dp.prototype.chatgpt;

public class PrototypeExample {

    private static Prototype prototype1;

    public static void main(String[] args) {
        Prototype prototype;
        prototype = new ConcretePrototypeA("germination");
        System.out.println(prototype);

        Prototype prototype1 = prototype.clone();
        System.out.println(prototype);
        System.out.println(prototype1);
    }
}
