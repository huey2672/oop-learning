package com.huey.learning.oop.designpattern.factorymethod.product.impl;

import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;

/**
 * Concrete Product
 *
 * @author huey
 */
public class Surface implements Laptop {

    @Override
    public void startup() {
        System.out.println("Starting up the Surface.");
    }

    @Override
    public void work() {
        System.out.println("The Surface is working.");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down the Surface.");
    }

}
