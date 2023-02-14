package com.shenyy.dp.flyweight.chatgpt;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Integer, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(int key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}
