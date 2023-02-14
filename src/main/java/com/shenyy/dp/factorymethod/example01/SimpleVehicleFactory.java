package com.shenyy.dp.factorymethod.example01;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        //before processing
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }

    public Plane createPlane() {return new Plane();}
}
