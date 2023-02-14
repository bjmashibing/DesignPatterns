package com.shenyy.dp.visitor.chatgpt;

import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
