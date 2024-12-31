package com.spring.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Entity.FullTimeSalary;
import com.spring.backend.Repository.EmployeeRepository;
import com.spring.backend.Repository.FulltimeSalaryRepository;

@Service
public class CreateService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private FulltimeSalaryRepository fullTimeSalaryRepository;

    public Employee saveEmployee(Employee employee) {
        FullTimeSalary savedSalary = fullTimeSalaryRepository.save(employee.getFullTimeSalary());

        employee.setFullTimeSalary(savedSalary);

        return employeeRepository.save(employee);
    }
}