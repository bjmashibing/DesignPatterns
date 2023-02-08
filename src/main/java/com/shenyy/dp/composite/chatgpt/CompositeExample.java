package com.shenyy.dp.composite.chatgpt;

public class CompositeExample {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        Composite composite1 = new Composite();
        composite1.add(composite);
        Component leaf3 = new Leaf("leaf3");
        composite1.add(leaf3);
        composite1.operation();
    }
}
