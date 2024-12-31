package com.spring.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Entity.FullTimeSalary;
import com.spring.backend.Service.GetService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/get/fulltime")
@RequiredArgsConstructor
public class GetFulltimeController {

    @Autowired
    private GetService getService;

    @GetMapping
    public List<Employee> getFulltimeEmployee () {
        return getService.getFulltimeEmployee();
    }
}
