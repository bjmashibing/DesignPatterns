package com.shenyy.dp.abstractfactory.chatGPT;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);
}
