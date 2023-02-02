package com.shenyy.dp.abstractfactory.example01.item;

// 零件的抽象类，初始化
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
