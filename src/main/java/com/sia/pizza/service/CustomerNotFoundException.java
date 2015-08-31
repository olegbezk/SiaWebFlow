package com.sia.pizza.service;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException() {}

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
