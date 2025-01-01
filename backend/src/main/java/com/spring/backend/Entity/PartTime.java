package com.spring.backend.Entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PartTime extends Employee {

    private double ratePerHour;
    private int hoursWorked;
    private double wage;

}
