package com.spring.backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Entity.UserAccountFullTime;
import com.spring.backend.Entity.UserAccountPartTime;
import com.spring.backend.Service.RetrieveService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/record")
@RequiredArgsConstructor
public class RetrieveController {

    private final RetrieveService retrieveService;

    // GET Full Time Record
    @GetMapping("/fulltime")
    public List<FullTime> getFullTimeEmployee() {
        return retrieveService.getFullTimeEmployee();
    }

    // GET Part Time Record
    @GetMapping("/parttime")
    public List<PartTime> getPartTimeEmployee() {
        return retrieveService.getPartTimeEmployee();
    }

    // GET UserAccount Full Time Record
    @GetMapping("/account-fulltime")
    public List<UserAccountFullTime> getUserAccountFullTime() {
        return retrieveService.getUserAccountFullTime();
    }

    // GET UserAccount Part Time Record
    @GetMapping("/account-parttime")
    public List<UserAccountPartTime> getUserAccountPartTime() {
        return retrieveService.getUserAccountPartTime();
    }
}
