package com.huey.learning.oop.designpattern.singleton;

/**
 * Enum singleton
 *
 * @author huey
 */
public enum EnumSingleton {

    /**
     *
     */
    INSTANCE("Enum Singleton");

    private String value;

    EnumSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}