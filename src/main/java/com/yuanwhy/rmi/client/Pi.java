package com.yuanwhy.rmi.client;

import com.yuanwhy.rmi.api.Task;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by hongyuan.wang on 26/10/2017.
 */
public class Pi implements Task<BigDecimal>, Serializable {

    private static final long serialVersionUID = 6423132751463336420L;

    @Override
    public BigDecimal execute() {
        return new BigDecimal(Math.PI);
    }
}
