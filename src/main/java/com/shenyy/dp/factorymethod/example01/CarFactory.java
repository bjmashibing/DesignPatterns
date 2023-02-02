package com.shenyy.dp.factorymethod.example01;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
