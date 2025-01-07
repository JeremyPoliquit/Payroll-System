package com.spring.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.Entity.FullTime;
import com.spring.backend.Entity.PartTime;
import com.spring.backend.Repository.FullTimeRepository;
import com.spring.backend.Repository.PartTimeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UpdateService {

    @Autowired
    private final FullTimeRepository fullTimeRepository;

    @Autowired
    private final PartTimeRepository partTimeRepository;

    public FullTime updateFullTimeRecord(Long id, FullTime fullTime) {
        if (!fullTimeRepository.existsById(id)) {
            throw new RuntimeException("FullTime employee not found");
        }
        fullTime.setId(id);
        return fullTimeRepository.save(fullTime);
    }

    public PartTime updatePartTimeRecord(Long id, PartTime partTime) {
        if (!partTimeRepository.existsById(id)) {
            throw new RuntimeException("PartTime employee not found");
        }
        partTime.setId(id);
        return partTimeRepository.save(partTime);
    }

}
