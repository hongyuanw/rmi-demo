package com.yuanwhy.rmi.client;

import com.yuanwhy.rmi.api.Compute;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by hongyuan.wang on 26/10/2017.
 */
public class ComputePi {

    public static void main(String args[]) {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
            Compute comp = (Compute) registry.lookup(name);
            Pi task = new Pi();
            BigDecimal pi = comp.executeTask(task);
            System.out.println(pi);
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }

}
