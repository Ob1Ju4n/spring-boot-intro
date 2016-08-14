package com.ob1ju4n.rsad.service;

import com.ob1ju4n.rsad.domain.Watch;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by j.ortiz on 05/08/2016.
 */
@Service
public class MyAppService {

    private List<Watch> watches;

    public MyAppService() {
        this.watches = new ArrayList<>();
    }

    public List<Watch> getWatches(){

        Watch watch1 = new Watch();
        watch1.setName("Sony SmartWatch 3");
        watch1.setPrice("$ 199.00 USD");
        watch1.setAvailable(true);
        watch1.setDescription("The watch that makes life simpler and smarter");
        watch1.setImgName("SmartWatch-3-SWR50.jpg");

        Watch watch2 = new Watch();
        watch2.setName("Pebble Steel");
        watch2.setPrice("$ 149.00 USD");
        watch2.setAvailable(false);
        watch2.setDescription("Pebble Steel is made for looking really, really good. " +
                "Equipped with the same great features and 24/7 liveability of the original Pebble smartwatch, " +
                "Steel takes it up a notch–all the way up to a suit and tie. " +
                "See everything that’s happening with a quick glance and get back to business, " +
                "or at least make it look that way");
        watch2.setImgName("steel-silverleather-front.jpg");

        watches.add(watch1);
        watches.add(watch2);

        return this.watches;
    }
}
