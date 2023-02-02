package com.shenyy.dp.abstractfactory.exercise;

public class ListFactory extends Factory {
    public ListFactory(String type) {
        super(type);
    }

    public static void main(String[] args) {
        Factory colaFactory = new ListFactory("Cola Factory");
        colaFactory.produce("steel", "glass", "Cola");

        Factory distillery = new ListFactory("Distillery");
        distillery.produce("wood", "glass", "wine");
    }

    @Override
    public void produce(String cap, String bottle, String drink) {
        System.out.println(super.getType());
        createCap(cap);
        createBottle(bottle);
        createDrink(drink);
        System.out.println();
    }

    @Override
    public void createBottle(String material) {
        Bottle bottle = new ListBottle(material);
    }

    @Override
    public void createCap(String material) {
        Cap cap = new ListCap(material);
    }

    @Override
    public void createDrink(String material) {
        Drink drink = new ListDrink(material);
    }
}
