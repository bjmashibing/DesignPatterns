package com.shenyy.dp.facade.chatgpt;

public class Facade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void methodA() {
        systemA.methodA();
    }

    public void methodB() {
        systemB.methodB();
    }

    public void methodC() {
        systemC.methodC();
    }

}
