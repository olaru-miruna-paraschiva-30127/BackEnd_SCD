package com.management.managementapi.repository;

import com.management.managementapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("select u from Employee u where u.dep_id = ?1")
    List<Employee> findByDep_id(Integer dep_id);
    @Query("select u from Employee u where u.dep_id = ?1 and u.id = u.manager_id")
    List<Employee> findManagerByDep_id(Integer dep_id);
}
