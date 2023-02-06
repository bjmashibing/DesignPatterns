package com.shenyy.dp.decorator.exercise;

public class SteelBottom extends Bottom {
    public SteelBottom() {
        setDescription("SteelBottom");
    }

    @Override
    public int getCost() {
        return 100;
    }
}
