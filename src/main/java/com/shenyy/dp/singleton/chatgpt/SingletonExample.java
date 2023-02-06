package com.shenyy.dp.singleton.chatgpt;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton.getInstance();
        singleton.setWindowName("window");
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setWindowName("new window");
        System.out.println(singleton.getWindowName());
        System.out.println(singleton1.getWindowName());
    }
}
