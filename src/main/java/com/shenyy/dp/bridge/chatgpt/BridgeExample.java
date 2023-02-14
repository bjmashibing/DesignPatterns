package com.shenyy.dp.bridge.chatgpt;

public class BridgeExample {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.applyColor();

        Shape triangle = new Triangle(new Green());
        triangle.applyColor();
        System.out.println("");
    }
}
