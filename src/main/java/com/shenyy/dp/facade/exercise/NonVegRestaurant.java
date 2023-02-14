package com.shenyy.dp.facade.exercise;

public class NonVegRestaurant implements Restaurant{
    @Override
    public Menu getMenu() {
        System.out.println("NonVeg");
        return new Menu("NonVeg");
    }
}
