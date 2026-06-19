package com.deepskilling.task;

public class TaskLinkedList {

    Task head;

    public void addTask(Task task) {

        if(head == null) {
            head = task;
            return;
        }

        Task temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = task;
    }

    public Task searchTask(int id) {

        Task temp = head;

        while(temp != null) {

            if(temp.taskId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }

    public void deleteTask(int id) {

        if(head == null)
            return;

        if(head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while(temp.next != null &&
                temp.next.taskId != id) {

            temp = temp.next;
        }

        if(temp.next != null)
            temp.next = temp.next.next;
    }

    public void displayTasks() {

        Task temp = head;

        while(temp != null) {

            System.out.println(
                    temp.taskId + " "
                    + temp.taskName + " "
                    + temp.status);

            temp = temp.next;
        }
    }
}