package com.cognizant.proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Image image =
                new ProxyImage("sample.jpg");

        System.out.println("Image Created");

        image.display();

        System.out.println();

        image.display();
    }
}