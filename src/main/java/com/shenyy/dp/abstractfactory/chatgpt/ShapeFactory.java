package com.shenyy.dp.abstractfactory.chatgpt;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }
}
