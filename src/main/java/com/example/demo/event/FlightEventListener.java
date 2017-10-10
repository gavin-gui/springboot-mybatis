package com.example.demo.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/29.
 */
@Component
public class FlightEventListener implements ApplicationListener<FlightEvent> {

    Logger log = LoggerFactory.getLogger(FlightEventListener.class);

    @Override
    public void onApplicationEvent(FlightEvent event) {
        log.info("spring event search flight:{}", event.getFlightDto());
    }
}
