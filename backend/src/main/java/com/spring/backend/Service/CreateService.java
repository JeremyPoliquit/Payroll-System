package com.spring.backend.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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

    public FullTime createFullTime(FullTime fullTime) {
        return fullTimeRepository.save(fullTime);
    }

    public PartTime createPartTime(PartTime partTime) {
        double wage = calculateWage(partTime.getRate(), partTime.getTimeIn(), partTime.getTimeOut());
        BigDecimal formattedWage = formatWage(wage);
        partTime.setWage(formattedWage.doubleValue());
        return partTimeRepository.save(partTime);
    }

    public double calculateWage(double rate, String timeIn, String timeOut) {
        LocalTime inTime = LocalTime.parse(timeIn);
        LocalTime outTime = LocalTime.parse(timeOut);
        long hoursWorked = ChronoUnit.HOURS.between(inTime, outTime);
        return rate * hoursWorked;
    }

    private BigDecimal formatWage(double wage) {
        BigDecimal wageBD = new BigDecimal(wage).setScale(2, RoundingMode.HALF_UP);
        return wageBD;
    }

}
