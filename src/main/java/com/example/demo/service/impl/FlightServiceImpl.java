package com.example.demo.service.impl;

import com.example.demo.event.FlightEvent;
import com.example.demo.mapper.FlightMapper;
import com.example.demo.model.FlightDto;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2017/09/27
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightMapper flightMapper;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public FlightDto findById(int flightId) {
        FlightDto flightDto = flightMapper.findById(flightId);
        FlightEvent flightEvent = new FlightEvent(this,flightDto);
        applicationContext.publishEvent(flightEvent);
        return flightDto;
    }

    @Override
    public List<FlightDto> findByDate(String flightDate) {
        return flightMapper.findByDate(flightDate);
    }
}
