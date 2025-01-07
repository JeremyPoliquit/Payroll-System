package com.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.backend.Entity.PartTime;

public interface PartTimeRepository extends JpaRepository<PartTime, Long> {

}
