package com.mashibing.dp;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
