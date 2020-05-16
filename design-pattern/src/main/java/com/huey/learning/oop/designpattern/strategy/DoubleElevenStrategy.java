package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

/**
 * discount strategy of Double Eleven
 *
 * @author huey
 */
public class DoubleElevenStrategy implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(final BigDecimal originalPrice) {
        // discount of 50%.
        return originalPrice.multiply(new BigDecimal("0.5"));
    }

}
