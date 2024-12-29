package com.spring.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Service.CreateService;

@RestController
@RequestMapping("/api/create")
public class CreateController {

    @Autowired
    private CreateService createService;

    // Handle the POST request from frontend
    @PostMapping
    public ResponseEntity<Employee> createEmployeeAndSalary(@RequestBody Employee employee) {
        // Ensure that the salary is saved before the employee
        Employee savedEmployee = createService.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }
}