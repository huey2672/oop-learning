package com.huey.learning.oop.designpattern.factorymethod;

import com.huey.learning.oop.designpattern.factorymethod.factory.LaptopStore;
import com.huey.learning.oop.designpattern.factorymethod.factory.impl.AppleStore;
import com.huey.learning.oop.designpattern.factorymethod.factory.impl.MicrosoftStore;
import com.huey.learning.oop.designpattern.factorymethod.product.Laptop;

/**
 * a case of factory method pattern
 *
 * @author huey
 */
public class FactoryMethodMain {

    public static void main(String[] args) {

        String storeType = args != null && args.length > 0 ? args[0] : null;

        LaptopStore laptopStore;
        if ("Apple".equalsIgnoreCase(storeType)) {
            laptopStore = new AppleStore();
        } else if ("Microsoft".equalsIgnoreCase(storeType)) {
            laptopStore = new MicrosoftStore();
        } else {
            throw new IllegalArgumentException("Unknown Laptop Store.");
        }

        Laptop laptop = laptopStore.createLaptop();
        laptopStore.display(laptop);

    }

}
