package com.shenyy.dp.factorymethod.chatgpt;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Dessert dessert = new DessertFactory().getDessert("Cake");
        dessert.make();
        Dessert dessert1 = new DessertFactory().getDessert("Pie");
        dessert1.make();
    }
}
