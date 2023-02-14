package com.shenyy.dp.composite.chatgpt;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}
