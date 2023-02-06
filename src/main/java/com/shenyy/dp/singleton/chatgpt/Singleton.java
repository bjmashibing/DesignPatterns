package com.shenyy.dp.singleton.chatgpt;

public class Singleton {
    private String windowName;

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
