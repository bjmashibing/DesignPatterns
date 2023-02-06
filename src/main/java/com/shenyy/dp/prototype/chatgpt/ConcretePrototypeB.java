package com.shenyy.dp.prototype.chatgpt;

public class ConcretePrototypeB extends Prototype {
    private int fieldB;

    public ConcretePrototypeB(int fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(fieldB);
    }
}
