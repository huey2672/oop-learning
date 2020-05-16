package com.huey.learning.oop.designpattern.strategy;

import java.math.BigDecimal;

public class StrategyMain {

    public static void main(String[] args) {

        Order order = new Order();
        order.addItem(new OrderItem("Apple", new BigDecimal("9.8"), 10));
        order.addItem(new OrderItem("Orange", new BigDecimal("6.6"), 10));
        order.addItem(new OrderItem("Banana", new BigDecimal("3.9"), 15));

        BigDecimal fullPrice = order.calculateSalePrice(new NoDiscountStrategy());
        System.out.printf("This order costs $%s at ordinary times.\n", fullPrice);

        BigDecimal priceOnWeekends = order.calculateSalePrice(new WeekendStrategy());
        System.out.printf("This order costs $%s on weekends.\n", priceOnWeekends);

        BigDecimal priceOnDoubleEleven = order.calculateSalePrice(new DoubleElevenStrategy());
        System.out.printf("This order costs $%s on Double Eleven.\n", priceOnDoubleEleven);

    }

}
