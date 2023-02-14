package com.shenyy.dp.decorator.exercise;

public class GlassBottom extends Bottom{
    @Override
    public int getCost() {
        return 200;
    }

    public GlassBottom() {
        setDescription("GlassBottom");
    }
}
