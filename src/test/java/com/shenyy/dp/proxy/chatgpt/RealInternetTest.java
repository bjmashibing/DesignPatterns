package com.shenyy.dp.proxy.chatgpt;

class RealInternetTest {

    @org.junit.jupiter.api.Test
    void connectTo() {
        RealInternet realInternet = new RealInternet();
        try {
            realInternet.connectTo("baidu.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}