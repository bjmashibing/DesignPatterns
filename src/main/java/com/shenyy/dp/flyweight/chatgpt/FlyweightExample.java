package com.shenyy.dp.flyweight.chatgpt;

public class FlyweightExample {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight(1);
        Flyweight flyweight2 = factory.getFlyweight(2);
        Flyweight flyweight3 = factory.getFlyweight(1);

        flyweight1.operation(100);
        flyweight2.operation(200);
        flyweight3.operation(300);
        System.out.println("");
    }
}
