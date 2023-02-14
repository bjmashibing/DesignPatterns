package com.shenyy.dp.abstractfactory.exercise2;

abstract class Car { //interface
    protected CarType carType;
    protected Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();
}
