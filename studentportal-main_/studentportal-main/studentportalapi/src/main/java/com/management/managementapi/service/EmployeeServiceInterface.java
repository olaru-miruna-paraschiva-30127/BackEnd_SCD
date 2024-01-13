package com.management.managementapi.service;

import com.management.managementapi.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee addEmployee(Employee employee);
    public List<Employee> findAllEmployee();
    public List<Employee> findAllEmployeeByDepId(Integer id);
    public List<Employee> findAllManagerByDepId(Integer id);
    public Optional<Employee> findEmployeeById(Integer input);
}
