package com.spring.backend.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Service.RetrieveService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/record")
@RequiredArgsConstructor
public class RetrieveController {

    private final RetrieveService retrieveService;

    // GET All Full Time Record
    @GetMapping("/fulltime/employee")
    public ResponseEntity<List<Employee>> getAllEmployeesWithFullTime() {
        List<Employee> employees = retrieveService.getAllEmployeesWithFullTime();
        return ResponseEntity.ok(employees);
    }

}
