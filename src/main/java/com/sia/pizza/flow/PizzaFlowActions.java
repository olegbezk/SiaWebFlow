package com.sia.pizza.flow;

import static org.apache.log4j.Logger.*;
import static com.sia.pizza.domain.PaymentType.*;

import com.sia.pizza.domain.*;
import com.sia.pizza.service.CustomerNotFoundException;
import com.sia.pizza.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */
public class PizzaFlowActions {

    private static final Logger LOGGER = getLogger(PizzaFlowActions.class);

    @Autowired
    private CustomerService customerService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException{

        Customer customer = customerService.lookupCustomer(phoneNumber);

        if (customer != null) {
            return customer;
        }else {
            throw new CustomerNotFoundException();
        }
    }

    public void addCustomer(Customer customer) {
        LOGGER.warn("TODO: Flesh out the addCustomer() method.");
    }

    public Payment verifyPayment(PaymentDetails paymentDetails) {
        Payment payment = null;
        if(paymentDetails.getPaymentType() == CREDIT_CARD) {
            payment = new CreditCardPayment();
        } else {
            payment = new CashOrCheckPayment();
        }

        return payment;
    }

    public void saveOrder(Order order) {
        LOGGER.warn("TODO: Flesh out the saveOrder() method.");
    }

    public boolean checkDeliveryArea(String zipCode) {
        LOGGER.warn("TODO: Flesh out the checkDeliveryArea() method.");
        return "75075".equals(zipCode);
    }

}
