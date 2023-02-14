package com.shenyy.dp.abstractfactory.example01.item;

// 零件抽象类，构造函数，抽象方法
public abstract class Item {
    
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
