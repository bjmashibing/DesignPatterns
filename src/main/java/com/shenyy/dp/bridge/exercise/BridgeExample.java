package com.shenyy.dp.bridge.exercise;

public class BridgeExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(),new Assemble());
        vehicle1.manufacture();
    }
}
