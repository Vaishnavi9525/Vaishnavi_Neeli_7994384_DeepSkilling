# Exercise 6 - Library Management System

## Scenario
Develop a Library Management System where users can search for books by title using Linear Search and Binary Search algorithms.

---

## Objective

Implement search operations on book records and compare the performance of Linear Search and Binary Search.

---

## Technologies Used

- Java
- Eclipse IDE
- Arrays
- Linear Search
- Binary Search

---

## Classes Used

### Book
Stores book information:

- bookId
- title
- author

### LinearSearch
Implements Linear Search algorithm.

### BinarySearch
Implements Binary Search algorithm.

### Main
Tests the search functionality.

---

## Operations Performed

### Linear Search
Searches each book sequentially until the required book is found.

### Binary Search
Searches the sorted array by repeatedly dividing the search space into halves.

---

## Time Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|------------|------------|------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## Advantages

### Linear Search
- Simple to implement
- Works on unsorted data

### Binary Search
- Faster for large datasets
- Efficient searching

---

## Limitations

### Linear Search
- Slow for large datasets

### Binary Search
- Requires sorted data

---

## Sample Output

```text
Linear Search Found: Python
Binary Search Found: Python
```

---

## Conclusion

This exercise demonstrates the implementation of Linear Search and Binary Search algorithms and highlights the efficiency of Binary Search for large sorted datasets.