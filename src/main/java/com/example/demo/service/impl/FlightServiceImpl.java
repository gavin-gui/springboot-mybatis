package com.example.demo.service.impl;

import com.example.demo.mapper.FlightMapper;
import com.example.demo.model.FlightDto;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightMapper flightMapper;

    @Override
    public FlightDto findById(int flightId) {
        return flightMapper.findById(flightId);
    }

    @Override
    public List<FlightDto> findByDate(String flightDate) {
        return flightMapper.findByDate(flightDate);
    }
}
