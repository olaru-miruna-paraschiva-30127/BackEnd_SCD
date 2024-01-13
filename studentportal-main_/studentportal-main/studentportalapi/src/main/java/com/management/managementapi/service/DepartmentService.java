package com.management.managementapi.service;

import com.management.managementapi.model.Department;
import com.management.managementapi.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService implements DepartmentServiceInterface {

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department addDepartment(Department department) {
        Department result = departmentRepository.save(department);
        //return "Successful";
        return result;
    }
    @Override
    public Optional<Department> findDepartmentById(Integer input) {
        return departmentRepository.findById(input);
    }
    @Override
    public List<Department> findAllDepartment() {
        return departmentRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

}
