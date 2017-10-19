package com.example.demo.mapper;

import com.example.demo.model.FlightDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @date 2017/10/18
 */
public interface FlightMapper {

    /**
     * 由航班ID查询航班
     * @param flightId 航班ID
     * @return
     */
    FlightDto findById(@Param("flightId") int flightId);

    /**
     * 查询指定日期的所有航班
     * @param flightDate 航班日期
     * @return
     */
    List<FlightDto> findByDate(@Param("flightDate") String flightDate);
}
