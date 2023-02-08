package com.shenyy.dp.proxy.example;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            internet.connectTo("baidu.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
