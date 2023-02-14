package com.shenyy.dp.strategy.chatgpt;

public class ShoppingCart {
    private int amount;

    public ShoppingCart(int amount) {
        this.amount = amount;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(amount);
    }
}
