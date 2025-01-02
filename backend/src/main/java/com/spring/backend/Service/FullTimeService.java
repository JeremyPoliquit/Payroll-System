package com.spring.backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Repository.FullTimeRepository;

@Service
public class FullTimeService {

    private final FullTimeRepository fullTimeRepository;

    public FullTimeService(FullTimeRepository fullTimeRepository) {
        this.fullTimeRepository = fullTimeRepository;
    }

    public List<FullTime> getFullTimeEmployee() {
        return fullTimeRepository.findAll();
    }
}
