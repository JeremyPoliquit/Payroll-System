package com.spring.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Service.CreateService;

@RestController
@RequestMapping("/api/create")
public class CreateController {

    @Autowired
    private CreateService createService;

    @PostMapping("/fulltime")
    public FullTime createFullTime (@RequestBody FullTime fullTime) {
        return createService.saveFullTime(fullTime);
    }

}