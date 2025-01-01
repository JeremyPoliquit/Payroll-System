package com.spring.backend.Entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
public class Employee {

    @Id
    private Long id;

    private String name;
    private String position;
    private String department;

}
