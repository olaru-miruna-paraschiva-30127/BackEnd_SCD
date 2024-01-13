package com.management.managementapi.service;

import com.management.managementapi.model.Employee;
import com.management.managementapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        Employee result = employeeRepository.save(employee);
       // return "Successful";
        return result;
    }
@Override
public List<Employee> findAllEmployeeByDepId(Integer id) {
    return employeeRepository.findByDep_id(id);
}
    @Override
    public List<Employee> findAllManagerByDepId(Integer id) {
        return employeeRepository.findManagerByDep_id(id);
    }
    @Override
    public Optional<Employee> findEmployeeById(Integer input) {
        return employeeRepository.findById(input);
    }


    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
