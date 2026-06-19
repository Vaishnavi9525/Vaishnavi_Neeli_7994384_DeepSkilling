package com.cognizant.observer;

public class MobileApp implements Observer {

    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(user +
                " received update: " +
                stockName +
                " = Rs." +
                price);
    }
}