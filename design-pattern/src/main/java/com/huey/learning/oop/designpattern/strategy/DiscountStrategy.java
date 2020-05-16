package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

/**
 * strategy of discount
 *
 * @author huey
 */
public interface DiscountStrategy {

    BigDecimal applyDiscount(final BigDecimal originalPrice);

}
