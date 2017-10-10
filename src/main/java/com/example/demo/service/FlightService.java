package com.example.demo.service;

import com.example.demo.model.FlightDto;

import java.util.List;

/**
 * Created by Administrator on 2017/9/29.
 */
public interface FlightService {

    FlightDto findById(int flightId);

    List<FlightDto> findByDate(String flightDate);

}
