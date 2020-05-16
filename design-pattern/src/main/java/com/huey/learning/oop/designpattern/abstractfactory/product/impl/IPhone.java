package com.huey.learning.oop.designpattern.abstractfactory.product.impl;

import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;

/**
 * Iphone, it is a concrete phone
 *
 * @author huey
 */
public class IPhone extends Phone {

    public IPhone(String verion, Color color) {
        super(verion, color);
        this.name = "iPhone";
    }

}
