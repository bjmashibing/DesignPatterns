package com.shenyy.dp.visitor.chatgpt;

public interface Visitor {
    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}
