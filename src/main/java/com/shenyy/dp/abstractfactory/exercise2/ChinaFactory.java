package com.shenyy.dp.abstractfactory.exercise2;

public class ChinaFactory extends CarFactory {
    @Override
    Car createMini() {
        Car car = new MiniCar(CarType.MINI,Location.CHINA);
        return car;
    }

    @Override
    Car createMicro() {
        Car car = new MicroCar(CarType.MICRO,Location.CHINA);
        return car;
    }

    @Override
    Car createLuxury() {
        Car car = new MicroCar(CarType.LUXURY,Location.CHINA);
        return car;
    }
}
