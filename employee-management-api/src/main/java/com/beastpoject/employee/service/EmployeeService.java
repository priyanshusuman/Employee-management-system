package com.beastpoject.employee.service;

import com.beastpoject.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createService(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
