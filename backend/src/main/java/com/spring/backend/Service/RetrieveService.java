package com.spring.backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Entity.UserAccountFullTime;
import com.spring.backend.Entity.UserAccountPartTime;
import com.spring.backend.Repository.FullTimeRepository;
import com.spring.backend.Repository.PartTimeRepository;
import com.spring.backend.Repository.UserAccountFullTimeRepository;
import com.spring.backend.Repository.UserAccountPartTimeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RetrieveService {

    private final FullTimeRepository fullTimeRepository;

    private final PartTimeRepository partTimeRepository;

    private final UserAccountFullTimeRepository userAccountFullTimeRepository;

    private final UserAccountPartTimeRepository userAccountPartTimeRepository;

    // Full Time Record
    public List<FullTime> getFullTimeEmployee() {
        return fullTimeRepository.findAll();
    }

    // Part Time Record
    public List<PartTime> getPartTimeEmployee () {
        return partTimeRepository.findAll();
    }

    // User Account Full Time Record
    public List<UserAccountFullTime> getUserAccountFullTime() {
        return userAccountFullTimeRepository.findAll();
    }

    // User Account Part Time Record
    public List<UserAccountPartTime> getUserAccountPartTime() {
        return userAccountPartTimeRepository.findAll();
    }
}
