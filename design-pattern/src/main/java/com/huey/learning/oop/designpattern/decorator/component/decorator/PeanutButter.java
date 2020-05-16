package com.huey.learning.oop.designpattern.decorator.component.decorator;

import com.huey.learning.oop.designpattern.decorator.component.Dessert;

import java.math.BigDecimal;

public class PeanutButter extends Sauce {

    public PeanutButter(Dessert dessert) {
        super(dessert);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with peanut butter";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("1.5"));
    }

}
