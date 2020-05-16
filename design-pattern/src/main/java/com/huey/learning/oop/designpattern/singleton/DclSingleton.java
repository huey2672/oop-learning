package com.huey.learning.oop.designpattern.singleton;

/**
 * Double-checked locking singleton
 *
 * @author huey
 */
public class DclSingleton {

    private static volatile DclSingleton singleton;

    private DclSingleton() {
        super();
    }

    public static DclSingleton getInstance() {

        if (singleton == null) {
            synchronized (DclSingleton.class) {
                if (singleton == null) {
                    singleton = new DclSingleton();
                }
            }
        }

        return singleton;
    }

}
