package com.management.managementapi.controller;

import com.management.managementapi.model.Department;
import com.management.managementapi.repository.DepartmentRepository;
import com.management.managementapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
@CrossOrigin
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
@Autowired
    DepartmentRepository departmentRepository;
    @PostMapping("/add")
    public Department addDepartment( @RequestBody Department department){
        return  departmentService.addDepartment(department);
    }

    @PutMapping("/editdepartment")
    public Department updateDepartmentById(@RequestBody Department inputDepartment){
        Optional<Department> department = departmentService.findDepartmentById(inputDepartment.getId());
        Department updatedDepartment = department.get();

        updatedDepartment.setDescription(inputDepartment.getDescription());
        updatedDepartment.setParentId(inputDepartment.getParentId());

        return departmentService.addDepartment(updatedDepartment);
        //return null;
    }

    @DeleteMapping("/deletedepartment/{id}")
    public void deleteDepartmentById(@PathVariable(value = "id") Integer id){
        departmentRepository.deleteById(id);
    }

    @GetMapping
    public List<Department> findAllDepartment(){
        return departmentService.findAllDepartment();
    }
}

