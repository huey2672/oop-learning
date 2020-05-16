package com.huey.learning.oop.designpattern.proxy;

public enum Team {

    /**
     *
     */
    ROCKETS("Rockets"),

    /**
     *
     */
    LAKERS("Lakers");

    private String name;

    Team(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
