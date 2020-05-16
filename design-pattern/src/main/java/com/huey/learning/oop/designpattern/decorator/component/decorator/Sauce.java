package com.huey.learning.oop.designpattern.decorator.component.decorator;

import com.huey.learning.oop.designpattern.decorator.component.Dessert;

import java.math.BigDecimal;

public abstract class Sauce extends Dessert {

    protected Dessert dessert;

    public Sauce(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription();
    }

    @Override
    public BigDecimal cost() {
        return dessert.cost();
    }

}
