package com.spring.backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class PartTime extends Employee {
    private double rate;
    private double wage;
    private String timeIn;
    private String timeOut;
}

