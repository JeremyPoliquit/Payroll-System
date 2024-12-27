package com.spring.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Repository.Repository;

@Service
public class CreateService {
    
    @Autowired
    private Repository repository;

    public Employee createEmployee (Employee employee) {
        return repository.save(employee);
    }
}
