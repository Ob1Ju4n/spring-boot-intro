package com.ob1ju4n.util;

/**
 * Created by j.ortiz on 19/08/2016.
 */
public interface Criteria<T> {
    T filter(T args);
}
