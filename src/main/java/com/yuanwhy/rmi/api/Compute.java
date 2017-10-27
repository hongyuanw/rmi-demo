package com.yuanwhy.rmi.api;

/**
 * Created by hongyuan.wang on 26/10/2017.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}