package com.shenyy.dp.facade.exercise;

public class VegNonRestaurant implements Restaurant {
    @Override
    public Menu getMenu() {
        System.out.println("VegNon");
        return new Menu("VegNon");
    }
}
