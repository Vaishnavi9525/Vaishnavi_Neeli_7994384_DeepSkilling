# Exercise 7 - Financial Forecasting

## Scenario

Develop a Financial Forecasting System that predicts future values based on current value, growth rate, and number of years using recursion.

---

## Objective

Implement a recursive algorithm to calculate future financial growth.

---

## Technologies Used

- Java
- Eclipse IDE
- Recursion
- Object-Oriented Programming (OOP)

---

## Classes Used

### FinancialForecast

Contains the recursive method for calculating future values.

### Main

Tests the financial forecasting functionality.

---

## Recursion

Recursion is a technique where a method calls itself until a base condition is reached.

Example:

```java
if(condition)
    return value;

return recursiveCall();
```

---

## Formula Used

Future Value = Present Value × (1 + Growth Rate)^Years

Where:

- Present Value = Current Investment
- Growth Rate = Annual Growth Rate
- Years = Forecast Period

---

## Operations Performed

### Predict Future Value

Uses recursion to calculate future value based on annual growth.

---

## Time Complexity Analysis

| Operation | Complexity |
|------------|------------|
| Recursive Forecast | O(n) |

Where n = Number of Years

---

## Advantages of Recursion

- Easy to understand
- Cleaner code
- Suitable for mathematical calculations

---

## Limitations of Recursion

- Additional memory usage
- Risk of stack overflow for very large inputs

---

## Optimization Techniques

The recursive solution can be optimized using:

- Memoization
- Dynamic Programming

to reduce repeated calculations.

---

## Sample Output

```text
Future Value: 16105.1
```

---

## Conclusion

This exercise demonstrates how recursion can be used to solve financial forecasting problems and calculate future values efficiently.