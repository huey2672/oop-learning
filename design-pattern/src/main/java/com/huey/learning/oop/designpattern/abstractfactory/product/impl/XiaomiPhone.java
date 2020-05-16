package com.huey.learning.oop.designpattern.abstractfactory.product.impl;

import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;

/**
 * Xiaomi phone, it is a concrete phone
 *
 * @author huey
 */
public class XiaomiPhone extends Phone {

    public XiaomiPhone(String verion, Color color) {
        super(verion, color);
        this.name = "Xiaomi phone";
    }

}
