package com.deepskilling.employee;

public class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;

    public void addEmployee(Employee employee) {
        employees[count++] = employee;
    }

    public Employee searchEmployee(int id) {
        for(int i=0;i<count;i++) {
            if(employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for(int i=0;i<count;i++) {
            System.out.println(
                    employees[i].employeeId + " "
                    + employees[i].name + " "
                    + employees[i].position + " "
                    + employees[i].salary);
        }
    }

    public void deleteEmployee(int id) {
        for(int i=0;i<count;i++) {
            if(employees[i].employeeId == id) {

                for(int j=i;j<count-1;j++) {
                    employees[j] = employees[j+1];
                }

                count--;
                break;
            }
        }
    }
}