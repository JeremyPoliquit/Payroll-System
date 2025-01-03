package com.spring.backend.Service;

import java.time.LocalTime;
import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Entity.UserAccountFullTime;
import com.spring.backend.Entity.UserAccountPartTime;
import com.spring.backend.Repository.EmployeeRepository;
import com.spring.backend.Repository.FullTimeRepository;
import com.spring.backend.Repository.PartTimeRepository;
import com.spring.backend.Repository.UserAccountFullTimeRepository;
import com.spring.backend.Repository.UserAccountPartTimeRepository;

@Service
public class CreateService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserAccountFullTimeRepository userAccountRepository;

    @Autowired
    private UserAccountPartTimeRepository userAccountPartTimeRepository;

    @Autowired
    private FullTimeRepository fullTimeSalaryRepository;

    @Autowired
    private PartTimeRepository partTimeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public UserAccountFullTime saveUserAccountTimeFullTime(UserAccountFullTime userAccount) {
        return userAccountRepository.save(userAccount);
    }

    public UserAccountPartTime saveUserAccountPartTime(UserAccountPartTime userAccountPartTime) {
        return userAccountPartTimeRepository.save(userAccountPartTime);
    }

    public FullTime saveFullTime(FullTime fullTime) {
        return fullTimeSalaryRepository.save(fullTime);
    }

    public PartTime savePartTime(PartTime partTime) {
        double wage = calculateWage(partTime);
        partTime.setWage(wage);
        return partTimeRepository.save(partTime);
    }

    // Logic to calculate wage for part-time employees
    private double calculateWage(PartTime partTimeEmployee) {
        try {
            LocalTime timeIn = LocalTime.parse(partTimeEmployee.getTimeIn());
            LocalTime timeOut = LocalTime.parse(partTimeEmployee.getTimeOut());

            // Calculate hours worked
            long minutesWorked = Duration.between(timeIn, timeOut).toMinutes();
            double hoursWorked = minutesWorked / 60.0;

            // Calculate wage
            return hoursWorked * partTimeEmployee.getRatePerHour();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid time format: " + e.getMessage());
        }
    }

}
