package com.cognizant.builder;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String bluetooth;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    public void display() {
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
        System.out.println("Graphics Card : " + graphicsCard);
        System.out.println("Bluetooth : " + bluetooth);
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String bluetooth;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}