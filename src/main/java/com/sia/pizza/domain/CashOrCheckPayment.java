package com.sia.pizza.domain;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class CashOrCheckPayment extends Payment {

    public CashOrCheckPayment() {
    }

    @Override
    public String toString() {
        return "CASH or CHECK:  $" + getAmount();
    }
}
