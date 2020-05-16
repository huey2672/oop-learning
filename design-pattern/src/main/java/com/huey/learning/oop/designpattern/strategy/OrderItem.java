package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {

    private String itemName;
    private BigDecimal price;
    private int quantity;

    /**
     * calculate the total price of this order item
     *
     * @return
     */
    BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

}
