package com.shenyy.dp.abstractfactory.chatgpt;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);
}
