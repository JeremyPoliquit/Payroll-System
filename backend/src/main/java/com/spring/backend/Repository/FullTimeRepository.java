package com.spring.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.backend.Entity.FullTime;

public interface FullTimeRepository extends JpaRepository<FullTime, Long> {
    List<FullTime> findByNameContainingIgnoreCase(String name);
}
