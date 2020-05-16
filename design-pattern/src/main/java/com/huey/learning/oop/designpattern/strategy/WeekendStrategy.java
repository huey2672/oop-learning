package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

/**
 * discount strategy of the weekends
 *
 * @author huey
 */
public class WeekendStrategy implements DiscountStrategy {

    @Override
    public BigDecimal applyDiscount(BigDecimal originalPrice) {

        // 20 off on purchase of 200 or above
        BigDecimal salePrice;
        if (originalPrice.compareTo(new BigDecimal("200")) > 0) {
            salePrice = originalPrice.subtract(new BigDecimal("20"));
        } else {
            salePrice = new BigDecimal(originalPrice.toPlainString());
        }

        return salePrice;

    }

}
