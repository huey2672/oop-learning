package com.huey.learning.oop.designpattern.abstractfactory.product.impl;

import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;

/**
 * Apple's earpods, it is a concrete earphones
 *
 * @author huey
 */
public class AppleEarpods extends Earphones {

    public AppleEarpods(Color color) {
        super(color);
    }

}
