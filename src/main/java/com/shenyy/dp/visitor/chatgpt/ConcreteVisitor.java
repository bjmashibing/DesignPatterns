package com.shenyy.dp.visitor.chatgpt;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("Visiting ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("Visiting ConcreteElementB");
    }
}
