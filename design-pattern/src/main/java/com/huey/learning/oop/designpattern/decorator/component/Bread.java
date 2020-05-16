package com.huey.learning.oop.designpattern.decorator.component;

import java.math.BigDecimal;

public class Bread extends Dessert {

    @Override
    public String getDescription() {
        return "Bread";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("5.0");
    }

}