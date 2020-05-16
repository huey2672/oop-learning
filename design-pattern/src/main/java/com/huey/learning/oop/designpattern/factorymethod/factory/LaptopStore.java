package com.huey.learning.oop.designpattern.factorymethod.factory;

import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;

/**
 * Creator
 *
 * @author huey
 */
public abstract class LaptopStore {

    /**
     * creates a laptop
     *
     * @return
     */
    public abstract Laptop createLaptop();

    /**
     * displays the laptop's information
     *
     * @param laptop
     */
    public void display(Laptop laptop) {
        laptop.startup();
        laptop.work();
    }

}
