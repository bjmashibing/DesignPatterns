package com.shenyy.dp.factorymethod.example01;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
    }
}
