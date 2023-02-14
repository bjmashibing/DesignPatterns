package com.shenyy.dp.abstractfactory.exercise2;

public class MiniCar extends Car {
    public MiniCar(CarType carType, Location location) {
        super(carType, location);
    }

    @Override
    void construct() {
        System.out.println("Manufacture a " + carType.toString() + " in " + location.toString());
    }
}
