package com.shenyy.dp.strategy.chatgpt;

public class PayPalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by PayPal.");
    }
}
