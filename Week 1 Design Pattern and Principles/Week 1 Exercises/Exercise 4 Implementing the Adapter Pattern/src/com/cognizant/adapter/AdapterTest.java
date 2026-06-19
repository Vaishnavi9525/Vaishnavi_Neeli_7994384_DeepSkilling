package com.cognizant.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(
                        new PayPalGateway());

        paypal.processPayment(5000);

        PaymentProcessor googlePay =
                new GooglePayAdapter(
                        new GooglePayGateway());

        googlePay.processPayment(2500);
    }
}