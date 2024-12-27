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

    @PostMapping
    public ResponseEntity<Employee> createEmployee (@RequestBody Employee employee) {
        Employee saveEmployee = createService.createEmployee(employee);
        return ResponseEntity.ok(saveEmployee);
    }
}
