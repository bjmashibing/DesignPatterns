package com.shenyy.dp.decorator.exercise;

public abstract class Bottom {
    private String description = "Unknown bottom";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int getCost();
}
