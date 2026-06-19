# Exercise 4 - Employee Management System

## Scenario
Develop an Employee Management System for a company to efficiently manage employee records using arrays.

---

## Objective
Implement employee record management operations such as:

- Add Employee
- Search Employee
- Display Employees
- Delete Employee

---

## Technologies Used

- Java
- Eclipse IDE
- Arrays
- Object-Oriented Programming (OOP)

---

## Classes Used

### Employee
Stores employee details:

- employeeId
- name
- position
- salary

### EmployeeManagement
Performs operations:

- Add Employee
- Search Employee
- Traverse Employees
- Delete Employee

### Main
Tests all functionalities of the Employee Management System.

---

## Operations Performed

### Add Employee
Adds a new employee record to the array.

### Search Employee
Searches an employee using employeeId.

### Traverse Employees
Displays all employee records.

### Delete Employee
Removes an employee record from the array.

---

## Time Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Add Employee | O(1) |
| Search Employee | O(n) |
| Traverse Employees | O(n) |
| Delete Employee | O(n) |

---

## Advantages of Arrays

- Fast access using index
- Simple implementation
- Memory efficient

---

## Limitations of Arrays

- Fixed size
- Insertion and deletion are costly
- Memory may be wasted if array is not fully utilized

---

## Sample Output

```
Employees:
101 Vaishnavi Developer 50000.0
102 Ram Tester 40000.0
103 Krishna Manager 70000.0

Found: Ram

After Deletion:
101 Vaishnavi Developer 50000.0
103 Krishna Manager 70000.0
```

---

## Conclusion

The Employee Management System demonstrates how arrays can be used to store and manage employee records efficiently. It also highlights the advantages and limitations of arrays in performing CRUD operations.