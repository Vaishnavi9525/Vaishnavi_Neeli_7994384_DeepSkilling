package com.cognizant.adapter;

public class GooglePayGateway {

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount +
                           " processed through Google Pay");
    }
}