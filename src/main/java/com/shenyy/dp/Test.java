package com.shenyy.dp;

import java.util.concurrent.locks.LockSupport;

public class Test {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(()->{
            System.out.println("start");
            LockSupport.park(); //一直wait
            System.out.println("continue");
        });
        t.start();

        Thread.sleep(1000);
        LockSupport.unpark(t); //t线程解除wait态
    }
}

//javap
