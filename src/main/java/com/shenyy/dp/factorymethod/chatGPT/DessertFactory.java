package com.shenyy.dp.factorymethod.chatGPT;

public class DessertFactory {
    Dessert getDessert(String dessertType) {
        if (dessertType == null) {
            return null;
        }
        if (dessertType.equalsIgnoreCase("CAKE")) {
            return new Cake();
        } else if (dessertType.equalsIgnoreCase("PIE")) {
            return new Pie();
        } else if (dessertType.equalsIgnoreCase("ICECREAM")) {
            return new IceCream();
        }
        return null;
    }
}
