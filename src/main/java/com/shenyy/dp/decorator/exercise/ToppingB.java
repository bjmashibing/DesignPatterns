package com.shenyy.dp.decorator.exercise;

public class ToppingB extends ToppingsDecorator{
    Bottom bottom;

    public ToppingB(Bottom bottom) {
        this.bottom = bottom;
    }

    @Override
    public int getCost() {
        return bottom.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return bottom.getDescription() + ", ToppingB";
    }
}
