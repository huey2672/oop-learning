package com.huey.learning.oop.designpattern.singleton;

/**
 * Lazy singleton
 *
 * @author huey
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
        super();
    }

    public synchronized static LazySingleton getInstance() {

        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
        
    }

}
