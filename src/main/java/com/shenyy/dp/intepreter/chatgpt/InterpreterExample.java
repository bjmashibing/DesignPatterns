package com.shenyy.dp.intepreter.chatgpt;

public class InterpreterExample {
    public static void main(String[] args) {
        Expression firstExpression = new NumberExpression(10);
        Expression secondExpression = new NumberExpression(20);

        Expression additionExpression = new AdditionExpression(firstExpression, secondExpression);
        System.out.println("Result = " + additionExpression.interpret());
    }
}
