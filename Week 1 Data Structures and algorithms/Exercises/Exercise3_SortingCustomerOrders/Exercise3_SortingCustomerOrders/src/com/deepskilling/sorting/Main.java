package com.deepskilling.sorting;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {

            new Order(101,"Vaishu",5000),
            new Order(102,"Ram",2000),
            new Order(103,"Krishna",8000),
            new Order(104,"Sai",3000)
        };

        System.out.println("Before Sorting");

        for(Order o : orders) {

            System.out.println(
                    o.orderId + " "
                    + o.customerName + " "
                    + o.totalPrice);
        }

        QuickSort.sort(orders,0,orders.length-1);

        System.out.println("\nAfter Sorting");

        for(Order o : orders) {

            System.out.println(
                    o.orderId + " "
                    + o.customerName + " "
                    + o.totalPrice);
        }
    }
}