package com.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.backend.Entity.Employee;

public interface Repository extends JpaRepository<Employee, Long>{
    
}
