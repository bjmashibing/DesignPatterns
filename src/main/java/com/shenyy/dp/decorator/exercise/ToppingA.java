package com.shenyy.dp.decorator.exercise;

public class ToppingA extends ToppingsDecorator {
    Bottom bottom;

    public ToppingA(Bottom bottom) {
        this.bottom = bottom;
    }

    @Override
    public int getCost() {
        return bottom.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return bottom.getDescription() + ", ToppingA";
    }
}
