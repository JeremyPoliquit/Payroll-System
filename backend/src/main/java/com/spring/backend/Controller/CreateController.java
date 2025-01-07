package com.spring.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Service.CreateService;

@RestController
@RequestMapping("/api/create")
public class CreateController {

    @Autowired
    private CreateService createService;

    @PostMapping("/fulltime/record")
    public ResponseEntity<FullTime> createFullTime (@RequestBody FullTime fullTime) {
        FullTime saveFullTime = createService.createFullTime(fullTime);
        return ResponseEntity.ok(saveFullTime);
    }

    @PostMapping("/parttime/record")
    public ResponseEntity<PartTime> createPartTime (@RequestBody PartTime partTime) {
        PartTime savePartTime = createService.createPartTime(partTime);
        return ResponseEntity.ok(savePartTime);
    }

}