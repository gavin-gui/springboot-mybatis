package com.example.demo.ws;

import com.example.demo.model.UserRequest;
import com.example.demo.model.UserResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

/**
 * @author guichao
 * @date 2017/10/19
 */
@Endpoint
public class UserEndpoint {

    @PayloadRoot(namespace = "http://www.donica.com/ws/demo", localPart = "UserRequest")
    @ResponsePayload
    public UserResponse findUserById(@RequestPayload UserRequest request) throws Exception {

        System.out.println(request.getUserId());

        UserResponse response = new UserResponse();
        response.setUsername("Freud");
        response.setGender("Male");
        response.setLocation("Dalian");
        response.setBirthday(new Date());

        return response;
    }

}
