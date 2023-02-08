package com.shenyy.dp.abstractfactory.exercise2;

public class MicroCar extends Car{
    public MicroCar(CarType carType, Location location) {
        super(carType, location);
    }

    @Override
    void construct() {
        System.out.println("Manufacture a " + carType.toString() + " in " + location.toString());
    }
}
