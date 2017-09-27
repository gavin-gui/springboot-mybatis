package com.example.demo.mapper;

import com.example.demo.model.FlightDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public interface FlightMapper {

    FlightDto findById(@Param("flightId") int flightId);

    List<FlightDto> findByDate(@Param("flightDate") String flightDate);
}
