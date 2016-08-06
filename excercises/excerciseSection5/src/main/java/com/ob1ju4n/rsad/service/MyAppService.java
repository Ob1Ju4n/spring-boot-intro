package com.ob1ju4n.rsad.service;

import com.ob1ju4n.rsad.domain.Watch;
import org.springframework.stereotype.Service;

/**
 * Created by j.ortiz on 05/08/2016.
 */
@Service
public class MyAppService {

    public Watch getWatch(){

        Watch watch = new Watch();
        watch.setName("Sony SmartWatch 3");
        watch.setPrice("USD 199.00");
        watch.setAvailable(true);

        return watch;
    }

}
