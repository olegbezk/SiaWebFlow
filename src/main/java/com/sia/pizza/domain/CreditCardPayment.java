package com.sia.pizza.domain;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class CreditCardPayment extends Payment {

    public CreditCardPayment() {
    }

    private String authorization;

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    @Override
    public String toString() {
        return "CREDIT:  $" + getAmount() + " ; AUTH: " + authorization;
    }
}
