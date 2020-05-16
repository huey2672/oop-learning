package com.huey.learning.oop.designpattern.abstractfactory.product.impl;

import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;

/**
 * Xiaomi's earphones, it is a concrete earphones
 *
 * @author huey
 */
public class XiaomiEarphones extends Earphones {

    public XiaomiEarphones(Color color) {
        super(color);
    }

}
