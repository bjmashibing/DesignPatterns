package com.shenyy.dp.abstractfactory.example02;

public class Main {
    public static void main(String[] args) {
        AbastractFactory f = new ModernFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}