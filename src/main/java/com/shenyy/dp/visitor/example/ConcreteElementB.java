package com.shenyy.dp.visitor.example;

public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
