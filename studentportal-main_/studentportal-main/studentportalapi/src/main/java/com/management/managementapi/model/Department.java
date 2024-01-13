package com.management.managementapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Entity
@Table(name = "department__")
@Getter
@Setter
public class Department {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private int parentId;


    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentId() {
        return parentId;
    }





    public void setParentId(int parentId) {
        this.parentId = parentId;
    }




}
