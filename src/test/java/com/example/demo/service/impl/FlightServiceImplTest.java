package com.example.demo.service.impl;

import com.example.demo.model.FlightDto;
import com.example.demo.service.FlightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightServiceImplTest {

    private Logger log = LoggerFactory.getLogger(FlightServiceImplTest.class);

    @Autowired
    FlightService flightService;

    @Test
    public void findById() throws Exception {
        FlightDto flightDto = flightService.findById(1719325);
        log.info(flightDto.toString());
    }

    @Test
    public void findByDate() {
        List<FlightDto> flightDtoList = flightService.findByDate("16-02-01");
        for (FlightDto flightDto : flightDtoList) {
            //System.out.println(flightDto);
            log.info(flightDto.toString());
        }
    }

}