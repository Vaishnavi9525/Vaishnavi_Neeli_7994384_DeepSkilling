# Exercise 1 - Inventory Management System

## Overview

This project implements an Inventory Management System for a warehouse. The system demonstrates the use of Data Structures and Algorithms to efficiently store, retrieve, update, and delete product information.

## Problem Statement

In a warehouse, managing a large inventory requires efficient data storage and retrieval. Data Structures and Algorithms help improve performance, reduce processing time, and make inventory operations scalable.

## Data Structure Used

**HashMap**

HashMap is used to store products because it provides fast access, insertion, update, and deletion operations using the Product ID as a key.

## Product Attributes

Each product contains:

* Product ID
* Product Name
* Quantity
* Price

## Features Implemented

### Add Product

Adds a new product to the inventory.

### Update Product

Updates existing product details.

### Delete Product

Removes a product from the inventory.

### Display Products

Displays all products available in the inventory.

## Time Complexity Analysis

| Operation      | Time Complexity |
| -------------- | --------------- |
| Add Product    | O(1)            |
| Update Product | O(1)            |
| Delete Product | O(1)            |
| Search Product | O(1)            |

## Optimization

Using HashMap improves performance by providing constant-time access to products through their Product ID.

## Project Structure

Exercise1_InventoryManagementSystem

├── src

│   └── InventoryManagementSystem.java

├── README.md

└── Output.png

## Output

The program execution output is provided in **Output.png**.

## Conclusion

This project demonstrates how Data Structures and Algorithms can be used to efficiently manage inventory data. HashMap enables fast product operations and is suitable for handling large inventories.
