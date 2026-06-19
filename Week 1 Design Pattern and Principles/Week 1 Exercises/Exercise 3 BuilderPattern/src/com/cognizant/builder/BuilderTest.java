package com.cognizant.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Computer computer =
                new Computer.Builder()
                        .setCpu("Intel i7")
                        .setRam("16GB")
                        .setStorage("512GB SSD")
                        .setGraphicsCard("NVIDIA RTX")
                        .setBluetooth("Bluetooth 5.0")
                        .build();

        computer.display();
    }
}