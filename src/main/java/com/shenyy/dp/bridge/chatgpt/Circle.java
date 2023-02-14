package com.shenyy.dp.bridge.chatgpt;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color ");
        color.applyColor();
    }
}
