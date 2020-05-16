package com.huey.learning.oop.designpattern.singleton;

/**
 * Static inner class singleton
 *
 * @author huey
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
        super();
    }

    private static class SingletonHolder {
        public static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
