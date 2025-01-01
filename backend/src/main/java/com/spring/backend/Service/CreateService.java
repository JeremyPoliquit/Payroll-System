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
    private FullTimeRepository fullTimeSalaryRepository;
    
    @Autowired
    private PartTimeRepository partTimeRepository;

    public FullTime saveFullTime(FullTime fullTime) {
        return fullTimeSalaryRepository.save(fullTime);
    }

    public PartTime savePartTime(PartTime partTime) {
        return partTimeRepository.save(partTime);
    }

}
