package com.sia.pizza.service;

import com.sia.pizza.domain.Order;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public interface PricingEngine {
    public float calculateOrderTotal(Order order);
}
