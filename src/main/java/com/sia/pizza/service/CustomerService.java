package com.sia.pizza.service;

import com.sia.pizza.domain.Customer;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
