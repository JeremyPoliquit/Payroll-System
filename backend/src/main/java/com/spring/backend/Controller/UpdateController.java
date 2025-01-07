package com.spring.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Service.UpdateService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/update")
@RequiredArgsConstructor
public class UpdateController {

    @Autowired
    private final UpdateService updateService;

    @PutMapping("/fulltime/{id}")
    public FullTime updateFullTime (@PathVariable Long id, @RequestBody FullTime fullTime) {
        return updateService.updateFullTimeRecord(id, fullTime);
    }

    @PutMapping("/parttime/{id}")
    public PartTime updatePartTime (@PathVariable Long id, @RequestBody PartTime partTime) {
        return updateService.updatePartTimeRecord(id, partTime);
    }
}
