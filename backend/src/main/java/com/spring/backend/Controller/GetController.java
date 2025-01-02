package com.spring.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Service.GetService;

@RestController
@RequestMapping("/api/get/records")
@CrossOrigin(origins = "http://localhost:3000")
public class GetController {

    @Autowired
    private GetService getService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllRecords () {
        List<Employee> employees = getService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
}
