package com.shenyy.dp.bridge.chatgpt;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
