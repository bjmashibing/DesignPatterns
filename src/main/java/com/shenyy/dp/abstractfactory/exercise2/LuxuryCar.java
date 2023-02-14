package com.shenyy.dp.abstractfactory.exercise2;

public class LuxuryCar extends Car {
    public LuxuryCar(CarType carType, Location location) {
        super(carType, location);
    }

    @Override
    void construct() {
        System.out.println("Manufacture a " + carType.toString() + " in " + location.toString());
    }
}
