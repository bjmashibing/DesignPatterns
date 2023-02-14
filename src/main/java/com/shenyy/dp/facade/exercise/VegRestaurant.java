package com.shenyy.dp.facade.exercise;

public class VegRestaurant implements Restaurant{
    @Override
    public Menu getMenu() {
        System.out.println("Veg");
        return new Menu("Veg");
    }
}
