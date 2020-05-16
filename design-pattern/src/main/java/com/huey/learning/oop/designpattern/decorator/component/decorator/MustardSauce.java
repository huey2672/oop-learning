package com.huey.learning.oop.designpattern.decorator.component.decorator;

import com.huey.learning.oop.designpattern.decorator.component.Dessert;

import java.math.BigDecimal;

public class MustardSauce extends Sauce {

    public MustardSauce(Dessert dessert) {
        super(dessert);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with mustard sauce";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("2.99"));
    }

}
