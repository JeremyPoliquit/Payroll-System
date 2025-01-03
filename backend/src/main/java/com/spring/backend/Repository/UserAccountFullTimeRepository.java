package com.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.backend.Entity.UserAccountFullTime;

public interface UserAccountFullTimeRepository extends JpaRepository<UserAccountFullTime, Long> {
    
}
