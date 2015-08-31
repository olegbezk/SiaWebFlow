package scripts

import com.sia.pizza.domain.Order
import com.sia.pizza.service.PricingEngine

/**
 * Created by Oleg.Bezkorovaynyi on 31 Aug 2015.
 */

class PricingEngineImpl implements PricingEngine, Serializable {
    public float calculateOrderTotal(Order order) {
        print "IN GROOVY";

        return 99.99;
    }
}
