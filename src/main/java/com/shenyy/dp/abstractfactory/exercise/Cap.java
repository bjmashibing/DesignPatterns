package com.shenyy.dp.abstractfactory.exercise;

public abstract class Cap {
    private String material;

    public Cap(String material) {
        this.material = material;
        System.out.println("Cap: " + material);
    }
}
