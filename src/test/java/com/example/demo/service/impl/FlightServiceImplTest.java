package com.example.demo.service.impl;

import com.example.demo.model.FlightDto;
import com.example.demo.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FlightServiceImplTest {

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
        /*for (FlightDto flightDto : flightDtoList) {
            log.info(flightDto.toString());
        }*/

        Stream.of(flightDtoList).forEach(flightDtos -> System.out.println(flightDtos));
    }

}