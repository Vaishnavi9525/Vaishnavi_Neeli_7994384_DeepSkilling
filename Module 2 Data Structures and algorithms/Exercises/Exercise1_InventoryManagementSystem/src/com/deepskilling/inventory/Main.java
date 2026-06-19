package com.deepskilling.inventory;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(
                new Product(101, "Laptop", 10, 50000));

        manager.addProduct(
                new Product(102, "Mouse", 20, 500));

        manager.updateProduct(101, 15);

        manager.deleteProduct(102);

        manager.displayProducts();
    }
}