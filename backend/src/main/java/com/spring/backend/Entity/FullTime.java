package com.spring.backend.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FullTime extends Employee{

    private double salary;
    private String timeIn;
    private String timeOut;
    
}
