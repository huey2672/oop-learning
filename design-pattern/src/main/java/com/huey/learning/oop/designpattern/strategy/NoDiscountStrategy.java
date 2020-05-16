package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

/**
 * no discount
 *
 * @author huey
 */
public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(final BigDecimal originalPrice) {
        // full price.
        return new BigDecimal(originalPrice.toPlainString());
    }

}
