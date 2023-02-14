package com.shenyy.dp.adapter.chatgpt;

public class AdapterExample {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.request();
    }
}
