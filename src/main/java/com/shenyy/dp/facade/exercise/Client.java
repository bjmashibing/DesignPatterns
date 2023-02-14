package com.shenyy.dp.facade.exercise;

public class Client {
    public static void main(String[] args) {
        Keeper restaurantKeeper = new RestaurantKeeper();
        restaurantKeeper.getVegMenu();
        restaurantKeeper.getNonVegMenu();
        restaurantKeeper.getVegNonMenu();
    }
}
