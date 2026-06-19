package com.deepskilling.inventory;

import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void updateProduct(int id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = quantity;
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayProducts() {
        for (Product p : inventory.values()) {
            p.display();
        }
    }
}