package com.shenyy.dp.strategy.chatgpt;

public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(99);
        shoppingCart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        shoppingCart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));
    }
}
