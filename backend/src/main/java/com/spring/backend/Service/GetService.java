package com.spring.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Entity.FullTimeSalary;
import com.spring.backend.Repository.EmployeeRepository;
import com.spring.backend.Repository.FulltimeSalaryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getFulltimeEmployee () {
        return employeeRepository.findAll();
    }
}