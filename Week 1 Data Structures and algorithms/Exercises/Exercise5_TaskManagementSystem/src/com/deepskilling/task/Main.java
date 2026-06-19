package com.deepskilling.task;

public class Main {

    public static void main(String[] args) {

        TaskLinkedList list =
                new TaskLinkedList();

        list.addTask(
                new Task(1,"Coding","Pending"));

        list.addTask(
                new Task(2,"Testing","Completed"));

        list.addTask(
                new Task(3,"Deployment","Pending"));

        System.out.println("Tasks:");

        list.displayTasks();

        Task task = list.searchTask(2);

        if(task != null)
            System.out.println(
                    "\nFound: " + task.taskName);

        list.deleteTask(2);

        System.out.println("\nAfter Deletion:");

        list.displayTasks();
    }
}