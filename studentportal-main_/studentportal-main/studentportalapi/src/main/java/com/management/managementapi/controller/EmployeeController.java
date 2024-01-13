package com.management.managementapi.controller;

import com.management.managementapi.model.Employee;
import com.management.managementapi.repository.EmployeeRepository;
import com.management.managementapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
@Autowired
EmployeeRepository employeeRepository;
    @PostMapping("/add")
    public Employee addEmployee( @RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> findALlEmployee(){
        return employeeService.findAllEmployee();
    }
    @GetMapping("/depid/{id}")
    public List<Employee>findAllEmployeeDI(@PathVariable(value = "id") Integer id){
        return employeeService.findAllEmployeeByDepId(id);
    }


    @GetMapping("/depidman/{id}")
    public List<Employee>findAllManagerDI(@PathVariable(value = "id") Integer id){
        return employeeService.findAllManagerByDepId(id);
    }

    @PutMapping("/editemployee")
    public Employee updateEmployeeById(@RequestBody Employee inputEmployee){
        Optional<Employee> employee = employeeService.findEmployeeById(inputEmployee.getId());
        Employee updatedEmployee = employee.get();

        updatedEmployee.setName(inputEmployee.getName());
        updatedEmployee.setDepId(inputEmployee.getDepId());
        updatedEmployee.setManagerId(inputEmployee.getManagerId());
        updatedEmployee.setEmail(inputEmployee.getEmail());
        return employeeService.addEmployee(updatedEmployee);
        //return null;
    }


    @DeleteMapping("/deleteemployee/{id}")
    public void deleteEmployeeById(@PathVariable(value = "id") Integer id){
        employeeRepository.deleteById(id);
    }

}
