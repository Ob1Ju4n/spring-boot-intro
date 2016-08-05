package com.ob1ju4n.rsad.service;

import com.ob1ju4n.rsad.MyAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Juan on 4/08/2016.
 */
@Service
public class ExampleService {

    private MyAppConfig myAppConfig;

    public String getUserFullName(){

        StringBuilder sb = new StringBuilder(myAppConfig.getFirstName()).
                append(" ").
                append(myAppConfig.getLastName());

        return sb.toString();
    }

    @Autowired
    public void setMyAppConfig(MyAppConfig myAppConfig){
        this.myAppConfig = myAppConfig;
    }
}
