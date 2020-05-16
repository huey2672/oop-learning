package com.huey.learning.oop.designpattern.abstractfactory.product;

/**
 * defines the color of the products
 *
 * @author huey
 */
public enum Color {

    /**
     *
     */
    WHITE("white"),

    /**
     *
     */
    BLACK("black"),

    /**
     * unknown color
     */
    UNKNOWN("unknown");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public static Color get(String color) {
        if (WHITE.name().equalsIgnoreCase(color)) {
            return WHITE;
        } else if (BLACK.name().equalsIgnoreCase(color)) {
            return BLACK;
        } else {
            return UNKNOWN;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

}
