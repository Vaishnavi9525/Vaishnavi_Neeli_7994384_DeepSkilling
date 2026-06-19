package com.cognizant.observer;

public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket =
                new StockMarket();

        Observer mobileUser =
                new MobileApp("Rahul");

        Observer webUser =
                new WebApp("Priya");

        stockMarket.registerObserver(
                mobileUser);

        stockMarket.registerObserver(
                webUser);

        stockMarket.setStockPrice(
                "TCS",
                4200);
    }
}