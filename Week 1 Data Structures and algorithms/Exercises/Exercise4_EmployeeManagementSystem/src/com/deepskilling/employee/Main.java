package com.deepskilling.employee;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement manager = new EmployeeManagement();

        manager.addEmployee(
                new Employee(101,"Vaishnavi","Developer",50000));

        manager.addEmployee(
                new Employee(102,"Ram","Tester",40000));

        manager.addEmployee(
                new Employee(103,"Krishna","Manager",70000));

        System.out.println("Employees:");

        manager.traverseEmployees();

        Employee emp = manager.searchEmployee(102);

        if(emp != null) {
            System.out.println("\nFound: " + emp.name);
        }

        manager.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");

        manager.traverseEmployees();
    }
}