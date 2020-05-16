package com.huey.learning.oop.designpattern.factorymethod.factory.impl;

import com.huey.learning.oop.designpattern.factorymethod.factory.LaptopStore;
import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;
import com.huey.learning.oop.designpattern.factorymethod.product.impl.Surface;

/**
 * Concrete Creator
 *
 * @author huey
 */
public class MicrosoftStore extends LaptopStore {

    @Override
    public Laptop createLaptop() {
        return new Surface();
    }

}
