package com.spring.backend.Entity;

import jakarta.persistence.*;

@Entity
public class FullTimeSalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hoursWorked;
    private double salaryAmount;
    private String timeIn;
    private String timeOut;

    @OneToOne(mappedBy = "fullTimeSalary")
    private Employee employee;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}