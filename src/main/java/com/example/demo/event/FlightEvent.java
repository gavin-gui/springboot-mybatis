package com.example.demo.event;

import com.example.demo.model.FlightDto;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2017/9/29.
 */
public class FlightEvent extends ApplicationEvent {

    private FlightDto flightDto;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public FlightEvent(Object source) {
        super(source);
    }

    public FlightEvent(Object source, FlightDto flightDto) {
        super(source);
        this.flightDto = flightDto;
    }

    public FlightDto getFlightDto() {
        return flightDto;
    }
}
