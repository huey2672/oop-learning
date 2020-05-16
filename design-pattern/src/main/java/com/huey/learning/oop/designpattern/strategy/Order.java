package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Order {

    @Getter
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    /**
     * calculate the sale price of this order
     *
     * @param discountStrategy
     * @return
     */
    public BigDecimal calculateSalePrice(DiscountStrategy discountStrategy) {

        // calculate the total price of all order items
        BigDecimal totalPrice = orderItems.stream()
                .map(item -> item.getTotalPrice())
                .reduce(new BigDecimal("0"), (x, y) -> x.add(y));

        // calculate the real sale price with discount
        BigDecimal salePrice = discountStrategy.applyDiscount(totalPrice);

        return salePrice;

    }

}
