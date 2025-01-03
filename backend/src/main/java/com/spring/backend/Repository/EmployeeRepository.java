package com.spring.backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.backend.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    List<Employee> findByNameIgnoreCase (String name);
}
