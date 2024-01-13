package com.management.managementapi.service;

import com.management.managementapi.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentServiceInterface {
    public Department addDepartment(Department department);
    public List<Department> findAllDepartment();
    public Optional<Department> findDepartmentById(Integer input);
}
