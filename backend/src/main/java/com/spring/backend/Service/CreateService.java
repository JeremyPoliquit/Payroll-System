package com.spring.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Repository.FullTimeRepository;

@Service
public class CreateService {

    @Autowired
    private FullTimeRepository fullTimeSalaryRepository;

    public FullTime saveFullTime(FullTime fullTime) {
        return fullTimeSalaryRepository.save(fullTime);
    }

}
