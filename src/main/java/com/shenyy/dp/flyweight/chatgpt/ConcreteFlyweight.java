package com.shenyy.dp.flyweight.chatgpt;

public class ConcreteFlyweight implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweight(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("Intrinsic State: " + intrinsicState + " Extrinsic State: " + extrinsicState);
    }
}
