package com.sia.pizza.domain;

import java.io.Serializable;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class Payment implements Serializable {

    private  static final long serialVersionUID = 1L;

    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
