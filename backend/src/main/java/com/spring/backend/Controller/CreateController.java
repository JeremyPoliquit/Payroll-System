package com.spring.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.Employee;
import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Entity.UserAccountFullTime;
import com.spring.backend.Entity.UserAccountPartTime;
import com.spring.backend.Service.CreateService;

@RestController
@RequestMapping("/api/create")
public class CreateController {

    @Autowired
    private CreateService createService;

    // Ignore
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = createService.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    // POST UserAccount Full Time Record
    @PostMapping("/account-fulltime")
    public ResponseEntity<UserAccountFullTime> createUserAccountFullTime(@RequestBody UserAccountFullTime userAccountFullTime) {
        UserAccountFullTime savedAccount = createService.saveUserAccountTimeFullTime(userAccountFullTime);
        return ResponseEntity.ok(savedAccount);
    }

    // POST UserAccount Part Time Record
    @PostMapping("/account-parttime")
    public ResponseEntity<UserAccountPartTime> createUserAccountPartTime(@RequestBody UserAccountPartTime userAccountPartTime) {
        UserAccountPartTime savedAccount = createService.saveUserAccountPartTime(userAccountPartTime);
        return ResponseEntity.ok(savedAccount);
    }

    // POST Full Time Record
    @PostMapping("/fulltime")
    public ResponseEntity<FullTime> createFullTime(@RequestBody FullTime fullTime) {
        FullTime savedEmployee = createService.saveFullTime(fullTime);
        return ResponseEntity.ok(savedEmployee);
    }

    // POST Part Time Record
    @PostMapping("/parttime")
    public ResponseEntity<PartTime> createPartTime(@RequestBody PartTime partTime) {
        PartTime savedEmployee = createService.savePartTime(partTime);
        return ResponseEntity.ok(savedEmployee);
    }

}