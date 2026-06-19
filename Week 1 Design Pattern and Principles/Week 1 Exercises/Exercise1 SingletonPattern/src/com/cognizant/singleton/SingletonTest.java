package com.cognizant.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();

        System.out.println(obj1 == obj2);
    }
}