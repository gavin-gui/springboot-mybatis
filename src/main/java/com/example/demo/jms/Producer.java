package com.example.demo.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @author Administrator
 * @date 2017/09/27
 */
@Component
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    Queue queue;

    public void sendMessage(String message) {
        jmsMessagingTemplate.convertAndSend(queue,message);
    }

}
