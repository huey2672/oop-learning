package com.huey.learning.oop.designpattern.singleton;

/**
 * Hungry singleton
 *
 * @author huey
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        super();
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

}
