package com.huey.learning.oop.designpattern.decorator.component;

import java.math.BigDecimal;

public class Cake extends Dessert {

    @Override
    public String getDescription() {
        return "Cake";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("9.98");
    }

}