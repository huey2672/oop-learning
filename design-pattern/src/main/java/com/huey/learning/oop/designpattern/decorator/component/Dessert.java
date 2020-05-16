package com.huey.learning.oop.designpattern.decorator.component;

import java.math.BigDecimal;

public abstract class Dessert {

    public abstract String getDescription();

    public abstract BigDecimal cost();

    public void display() {
        System.out.println(getDescription() + ", $" + cost());
    }

}
