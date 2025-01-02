package com.spring.backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Service.PartTimeService;
import com.spring.backend.Entity.PartTime;

@RestController
@RequestMapping("/api/record")
public class PartTimeController {
    
    private final PartTimeService partTimeService;

    public PartTimeController (PartTimeService partTimeService) {
        this.partTimeService = partTimeService;
    }

    @GetMapping("/parttime")
    public List<PartTime> getPartTimeEmployee () {
        return partTimeService.getPartTimeEmployee();
    }
}
