package com.spring.backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class FullTime extends Employee {
    private double salary;
    private String timeIn;
    private String timeOut;
}
