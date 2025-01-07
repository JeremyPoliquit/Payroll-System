package com.spring.backend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Service.RetrieveService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/get")
@RequiredArgsConstructor
public class RetrieveController {

    private final RetrieveService retrieveService;

    @GetMapping("/fulltime/record")
    public List<FullTime> getFullTimeRecord () {
        return retrieveService.getFullTimeRecord();
    }

    @GetMapping("/parttime/record")
    public List<PartTime> getPartTimeRecord () {
        return retrieveService.getPartTimeRecord();
    }

}
