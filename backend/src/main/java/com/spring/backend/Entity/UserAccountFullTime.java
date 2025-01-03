package com.spring.backend.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserAccountFullTime extends FullTime {
    
    private String email;
    private String password;
}
