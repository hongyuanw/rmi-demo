package com.yuanwhy.rmi.api;

/**
 * Created by hongyuan.wang on 26/10/2017.
 */
public interface Task<T> {
    T execute();
}
