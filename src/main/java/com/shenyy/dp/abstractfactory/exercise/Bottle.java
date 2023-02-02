package com.shenyy.dp.abstractfactory.exercise;

public abstract class Bottle {
    private String material;

    public Bottle(String material) {
        this.material = material;
        System.out.println("Bottle: " + material);
    }
}
