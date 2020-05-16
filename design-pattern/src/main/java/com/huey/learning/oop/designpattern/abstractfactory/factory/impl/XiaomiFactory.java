package com.huey.learning.oop.designpattern.abstractfactory.factory.impl;

import com.huey.learning.oop.designpattern.abstractfactory.factory.PhoneFactory;
import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;
import com.huey.learning.oop.designpattern.abstractfactory.product.impl.XiaomiEarphones;
import com.huey.learning.oop.designpattern.abstractfactory.product.impl.XiaomiPhone;

/**
 * Xiaomi's phone factory, it is a concrete factory
 *
 * @author huey
 */
public class XiaomiFactory extends PhoneFactory {

    @Override
    public Phone createPhone(String version, Color color) {
        return new XiaomiPhone(version, color);
    }

    @Override
    public Earphones createEarphones(Color color) {
        return new XiaomiEarphones(color);
    }

}
