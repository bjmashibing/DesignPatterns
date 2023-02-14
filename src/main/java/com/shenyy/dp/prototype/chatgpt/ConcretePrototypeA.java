package com.shenyy.dp.prototype.chatgpt;

public class ConcretePrototypeA extends Prototype {
    private String fieldA;

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public ConcretePrototypeA(String fieldA) {
        this.fieldA = fieldA;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(fieldA);
    }
}
