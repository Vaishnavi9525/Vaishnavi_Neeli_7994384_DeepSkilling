package com.deepskilling.search;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,"Keyboard","Electronics"),
                new Product(102,"Laptop","Electronics"),
                new Product(103,"Mouse","Electronics"),
                new Product(104,"Phone","Electronics")
        };

        Product result1 =
                LinearSearch.search(products,"Mouse");

        if(result1 != null)
            System.out.println("Linear Search Found : "
                    + result1.productName);

        Product result2 =
                BinarySearch.search(products,"Mouse");

        if(result2 != null)
            System.out.println("Binary Search Found : "
                    + result2.productName);
    }
}