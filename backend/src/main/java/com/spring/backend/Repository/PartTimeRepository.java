package com.spring.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.backend.Entity.PartTime;

public interface PartTimeRepository extends JpaRepository<PartTime, Long> {
    List<PartTime> findByNameContainingIgnoreCase(String name);
}
