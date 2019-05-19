package com.mashibing.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
    }
}
