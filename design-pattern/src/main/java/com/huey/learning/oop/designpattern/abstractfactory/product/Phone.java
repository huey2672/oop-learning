package com.huey.learning.oop.designpattern.abstractfactory.product;

import lombok.Data;

/**
 * abstract phone
 *
 * @author huey
 */
@Data
public abstract class Phone {

    protected String name;
    protected String version;
    protected Color color;
    private Earphones earphones;

    public Phone(String version, Color color) {
        this.version = version;
        this.color = color;
    }

    public void display() {
        System.out.printf("This is a(n) %s, ", this);
        if (earphones != null) {
            System.out.printf("and it has a pair of %s.\n", earphones);
        } else {
            System.out.printf("and it doesn't have earphones.\n");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", color, name, version);
    }

}
