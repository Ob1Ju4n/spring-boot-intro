package com.ob1ju4n.util;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by j.ortiz on 19/08/2016.
 */
public abstract class Queryable implements Serializable {

    Date from;
    Date to;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
