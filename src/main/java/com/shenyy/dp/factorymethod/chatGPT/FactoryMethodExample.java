package com.shenyy.dp.factorymethod.chatGPT;

public class FactoryMethodExample {
    public static void main(String[] args) {
        Dessert dessert = new DessertFactory().getDessert("Cake");
        dessert.make();
    }
}
