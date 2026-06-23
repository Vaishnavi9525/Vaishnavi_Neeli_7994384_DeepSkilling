package com.cognizant.employeemanagementsystem.repository;

import com.cognizant.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    List<Employee> findByEmployeeName(String employeeName);

    List<Employee> findByEmployeeEmailContaining(String keyword);
}