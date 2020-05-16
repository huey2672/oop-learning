package com.huey.learning.oop.designpattern.abstractfactory.factory.impl;

import com.huey.learning.oop.designpattern.abstractfactory.factory.PhoneFactory;
import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;
import com.huey.learning.oop.designpattern.abstractfactory.product.impl.AppleEarpods;
import com.huey.learning.oop.designpattern.abstractfactory.product.impl.IPhone;

/**
 * Apple's phone factory, it is a concrete factory
 *
 * @author huey
 */
public class AppleFactory extends PhoneFactory {

    @Override
    public Phone createPhone(String version, Color color) {
        return new IPhone(version, color);
    }

    @Override
    public Earphones createEarphones(Color color) {
        return new AppleEarpods(color);
    }

}
