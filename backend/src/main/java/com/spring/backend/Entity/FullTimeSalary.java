package com.spring.backend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullTimeSalary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hoursWorked;
    private String jobType;
    private double salaryAmount;
    private String timeIn;
    private String timeOut;

    @OneToOne(mappedBy = "fullTimeSalary")
    @JsonBackReference
    private Employee employee;
}
