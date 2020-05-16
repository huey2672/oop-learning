package com.huey.learning.oop.designpattern.factorymethod.factory.impl;

import com.huey.learning.oop.designpattern.factorymethod.factory.LaptopStore;
import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;
import com.huey.learning.oop.designpattern.factorymethod.product.impl.MacBook;

/**
 * Concrete Creator
 *
 * @author huey
 */
public class AppleStore extends LaptopStore {

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }

}
