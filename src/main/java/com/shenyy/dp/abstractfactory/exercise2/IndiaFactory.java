package com.shenyy.dp.abstractfactory.exercise2;

public class IndiaFactory extends CarFactory {
    @Override
    Car createMini() {
        Car car = new MiniCar(CarType.MINI, Location.INDIA);
        return car;
    }

    @Override
    Car createMicro() {
        Car car = new MicroCar(CarType.MICRO, Location.INDIA);
        return car;
    }

    @Override
    Car createLuxury() {
        return null;
    }
}
