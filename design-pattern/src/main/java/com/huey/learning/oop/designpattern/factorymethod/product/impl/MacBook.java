package com.huey.learning.oop.designpattern.factorymethod.product.impl;

import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;

/**
 * Concrete Product
 *
 * @author huey
 */
public class MacBook implements Laptop {

    @Override
    public void startup() {
        System.out.println("Starting up the MacBook.");
    }

    @Override
    public void work() {
        System.out.println("The MacBook is working.");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down the MacBook.");
    }

}
