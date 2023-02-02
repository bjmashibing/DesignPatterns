package com.shenyy.dp.abstractfactory.example01.item;

import java.util.ArrayList;

// 零件的抽象类，初始化
public abstract class Tray extends Item {

    protected ArrayList<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

}
