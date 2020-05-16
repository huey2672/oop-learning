package com.huey.learning.oop.designpattern.decorator.component.decorator;

import com.huey.learning.oop.designpattern.decorator.component.Dessert;

import java.math.BigDecimal;

public class TomatoSauce extends Sauce {

    public TomatoSauce(Dessert dessert) {
        super(dessert);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with tomato sauce";
    }

    @Override
    public BigDecimal cost() {
        return super.cost().add(new BigDecimal("1.0"));
    }

}
