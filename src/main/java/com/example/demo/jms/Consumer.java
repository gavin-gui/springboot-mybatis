package com.example.demo.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2017/9/29.
 * 消息消费者
 */
@Component
public class Consumer {

    Logger log = LoggerFactory.getLogger(Consumer.class);

    @JmsListener(destination = "my.queue")
    public void receiveQueue(String text) {
        log.info("Consumer接受消息："+text);
    }

}
