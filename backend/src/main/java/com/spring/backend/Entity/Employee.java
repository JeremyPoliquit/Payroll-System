package com.spring.backend.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private String department;

    @OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinColumn(name = "salary_id")
    private FullTimeSalary fullTimeSalary;
}
