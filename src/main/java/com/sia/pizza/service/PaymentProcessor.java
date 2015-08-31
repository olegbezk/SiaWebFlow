package com.sia.pizza.service;

import com.sia.pizza.PaymentException;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class PaymentProcessor {

    public PaymentProcessor() {}

    public void approveCreditCard(String creditCardNumber, String expMonth,
                                  String expYear, float amount) throws PaymentException {
        if (amount > 20.00) {
            throw new PaymentException();
        }
    }

}
