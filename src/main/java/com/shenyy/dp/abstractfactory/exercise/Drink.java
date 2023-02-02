package com.shenyy.dp.abstractfactory.exercise;

public abstract class Drink {
    private String material;

    public Drink(String material) {
        this.material = material;
        System.out.println("Drink: " + material);
    }
}
