package com.spring.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String name;
    private String position;
    private String department;

    public Employee () {}

    public Long getEmployeeId () {
        return employeeId;
    }

    public String getName () {
        return name;
    }
    
    public String getPosition () {
        return position;
    }

    public String getDepartment () {
        return department;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public void setDepartment (String department) {
        this.department = department;
    }
}
