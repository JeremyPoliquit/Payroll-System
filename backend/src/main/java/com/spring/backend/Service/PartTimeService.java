package com.spring.backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.backend.Entity.PartTime;
import com.spring.backend.Repository.PartTimeRepository;

@Service
public class PartTimeService {
    
    private final PartTimeRepository partTimeRepository;

    public PartTimeService (PartTimeRepository partTimeRepository) {
        this.partTimeRepository = partTimeRepository;
    }

    public List<PartTime> getPartTimeEmployee () {
        return partTimeRepository.findAll();
    }
}
