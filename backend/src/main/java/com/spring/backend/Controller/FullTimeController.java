package com.spring.backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Service.FullTimeService;

@RestController
@RequestMapping("/api/record/")
public class FullTimeController {

    private final FullTimeService fullTimeService;

    public FullTimeController(FullTimeService fullTimeService) {
        this.fullTimeService = fullTimeService;
    }

    @GetMapping("/fulltime")
    public List<FullTime> getFullTimeEmployee() {
        return fullTimeService.getFullTimeEmployee();
    }
}
