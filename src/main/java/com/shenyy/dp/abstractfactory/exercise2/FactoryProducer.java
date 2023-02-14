package com.shenyy.dp.abstractfactory.exercise2;

public class FactoryProducer {
    public static void main(String[] args) {
        CarFactory factory = new ChinaFactory();
        Car car = factory.createLuxury();
        car.construct();

        CarFactory indiaFactory = new IndiaFactory();
        Car miniCar = indiaFactory.createMini();
        miniCar.construct();
    }
}
