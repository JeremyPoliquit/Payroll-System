package com.spring.backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Repository.FullTimeRepository;
import com.spring.backend.Repository.PartTimeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RetrieveService {

    private final FullTimeRepository fullTimeRepository;
    
    private final PartTimeRepository partTimeRepository;

    public List<FullTime> getFullTimeRecord () {
        return fullTimeRepository.findAll();
    }

    public List<FullTime> searchFullTimeByName(String name) {
        return fullTimeRepository.findByNameContainingIgnoreCase(name);
    }

    public List<PartTime> getPartTimeRecord () {
        return partTimeRepository.findAll();
    }

    public List<PartTime> searchPartTimeByName(String name) {
        return partTimeRepository.findByNameContainingIgnoreCase(name);
    }

}
