# Exercise 5 - Task Management System

## Scenario
Develop a Task Management System where tasks can be added, searched, displayed, and deleted efficiently using a Singly Linked List.

---

## Objective
Implement task management operations using a linked list data structure.

The system should support:

- Add Task
- Search Task
- Display Tasks
- Delete Task

---

## Technologies Used

- Java
- Eclipse IDE
- Singly Linked List
- Object-Oriented Programming (OOP)

---

## Classes Used

### Task
Stores task information:

- taskId
- taskName
- status

### TaskLinkedList
Implements linked list operations:

- Add Task
- Search Task
- Delete Task
- Display Tasks

### Main
Tests all functionalities of the Task Management System.

---

## Operations Performed

### Add Task
Adds a new task to the linked list.

### Search Task
Searches for a task using taskId.

### Display Tasks
Traverses and displays all tasks.

### Delete Task
Removes a task from the linked list.

---

## Time Complexity Analysis

| Operation | Time Complexity |
|------------|----------------|
| Add Task | O(n) |
| Search Task | O(n) |
| Delete Task | O(n) |
| Traverse Tasks | O(n) |

---

## Advantages of Linked Lists

- Dynamic size
- Easy insertion and deletion
- No need for contiguous memory allocation
- Better memory utilization for dynamic data

---

## Limitations of Linked Lists

- Extra memory required for pointers
- Sequential access only
- Searching is slower compared to arrays

---

## Sample Output

```
Tasks:

1 Coding Pending
2 Testing Completed
3 Deployment Pending

Found: Testing

After Deletion:

1 Coding Pending
3 Deployment Pending
```

---

## Conclusion

This exercise demonstrates the implementation of a Task Management System using a Singly Linked List. It shows how linked lists provide flexibility for dynamic data management and efficient insertion and deletion operations.