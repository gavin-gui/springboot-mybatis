package com.example.demo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Administrator on 2017/10/19.
 */
@XmlRootElement(namespace = "http://www.donica.com/ws/demo", name = "UserRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserRequest {

    @XmlElement(namespace = "http://www.donica.com/ws/demo")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
