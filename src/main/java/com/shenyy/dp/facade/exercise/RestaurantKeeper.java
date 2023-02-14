package com.shenyy.dp.facade.exercise;

public class RestaurantKeeper implements Keeper {

    @Override
    public Menu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return vegRestaurant.getMenu();
    }

    @Override
    public Menu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return nonVegRestaurant.getMenu();
    }

    @Override
    public Menu getVegNonMenu() {
        VegNonRestaurant vegNonRestaurant = new VegNonRestaurant();
        return vegNonRestaurant.getMenu();
    }
}
