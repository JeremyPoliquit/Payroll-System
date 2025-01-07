package com.spring.backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RetrieveService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeesWithFullTime() {
        return employeeRepository.findAllWithFullTime();
    }

}
