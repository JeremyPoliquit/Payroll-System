package com.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.backend.Entity.FullTimeSalary;


public interface FulltimeSalaryRepository extends JpaRepository<FullTimeSalary, Long> {
    
}
