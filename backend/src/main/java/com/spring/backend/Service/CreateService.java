package com.spring.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Repository.FullTimeRepository;
import com.spring.backend.Repository.PartTimeRepository;

@Service
public class CreateService {

    @Autowired
    private FullTimeRepository fullTimeRepository;

    @Autowired
    private PartTimeRepository partTimeRepository;
    
    public FullTime createFullTime (FullTime fullTime) {
        return fullTimeRepository.save(fullTime);
    }

    public PartTime createPartTime (PartTime partTime) {
        return partTimeRepository.save(partTime);
    }

}
