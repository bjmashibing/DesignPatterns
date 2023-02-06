package com.shenyy.dp.decorator.exercise;

public class DecoratorExample {
    public static void main(String[] args) {
        Bottom bottom = new SteelBottom();
        bottom = new ToppingA(bottom);
        bottom = new ToppingB(bottom);
        System.out.println(bottom.getDescription() + " Cost: " + bottom.getCost());

        Bottom bottom1 = new GlassBottom();
        bottom1 = new ToppingB(bottom1);
        bottom1 = new ToppingB(bottom1);
        bottom1 = new ToppingB(bottom1);
        bottom1 = new ToppingB(bottom1);
        System.out.println(bottom1.getDescription() + " Cost: " + bottom1.getCost());
    }
}
