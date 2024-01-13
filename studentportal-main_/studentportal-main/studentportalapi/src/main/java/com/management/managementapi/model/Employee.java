package com.management.managementapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Entity
@Table(name = "employee__")
@Getter
@Setter

public class Employee {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int dep_id;
    private int manager_id;
    private String email;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepId() {
        return dep_id;
    }

    public int getManagerId() {
        return manager_id;
    }

    public String getEmail() {
        return email;
    }

    public void setDepId(int depId) {
        this.dep_id = depId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setManagerId(int managerId) {
        this.manager_id = managerId;
    }
}
