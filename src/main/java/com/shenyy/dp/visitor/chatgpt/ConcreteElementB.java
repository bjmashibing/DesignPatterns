package com.shenyy.dp.visitor.chatgpt;

public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
