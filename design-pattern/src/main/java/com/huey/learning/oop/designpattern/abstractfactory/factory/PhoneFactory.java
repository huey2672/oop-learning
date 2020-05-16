package com.huey.learning.oop.designpattern.abstractfactory.factory;

import com.huey.learning.oop.designpattern.abstractfactory.product.Color;
import com.huey.learning.oop.designpattern.abstractfactory.product.Earphones;
import com.huey.learning.oop.designpattern.abstractfactory.product.Phone;

/**
 * abstract phone factory
 *
 * @author huey
 */
public abstract class PhoneFactory {

    /**
     * the method for creating a phone
     *
     * @param version
     * @param color
     * @return
     */
    public abstract Phone createPhone(String version, Color color);

    /**
     * the method for creating a pairs of earphones
     *
     * @param color
     * @return
     */
    public abstract Earphones createEarphones(Color color);

    /**
     * the method for assembling a phone with a pairs of earphones
     *
     * @param phone
     * @param earphones
     */
    public void assemblePhone(Phone phone, Earphones earphones) {
        if (phone != null && earphones != null) {
            phone.setEarphones(earphones);
        }
    }

}
