package com.cognizant.strategy;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext context =
                new PaymentContext();

        context.setStrategy(
                new CreditCardPayment());

        context.makePayment(5000);

        context.setStrategy(
                new PayPalPayment());

        context.makePayment(2500);

        context.setStrategy(
                new UpiPayment());

        context.makePayment(1000);
    }
}