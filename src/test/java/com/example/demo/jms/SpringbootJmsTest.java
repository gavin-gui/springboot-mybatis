package com.example.demo.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by Administrator on 2017/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsTest {

    @Autowired
    Producer producer;

    @Test
    public void sendMessage() {
        producer.sendMessage("springboot activemq test.");
    }

}
