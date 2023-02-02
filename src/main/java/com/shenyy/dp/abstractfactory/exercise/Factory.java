package com.shenyy.dp.abstractfactory.exercise;

public abstract class Factory {
    private String type;

    public String getType() {
        return type;
    }

    public Factory(String type) {
        this.type = type;
    }

    public abstract void produce(String cap, String bottle, String drink);

    public abstract void createBottle(String material);

    public abstract void createCap(String material);

    public abstract void createDrink(String material);
}
