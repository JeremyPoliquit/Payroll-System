package com.spring.backend.Entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "salary_id")
    private FullTimeSalary fullTimeSalary;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public FullTimeSalary getFullTimeSalary() {
        return fullTimeSalary;
    }

    public void setFullTimeSalary(FullTimeSalary fullTimeSalary) {
        this.fullTimeSalary = fullTimeSalary;
    }
}