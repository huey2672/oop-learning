package com.huey.learning.oop.designpattern.abstractfactory.product;

import lombok.Data;

/**
 * abstract earphones
 *
 * @author huey
 */
@Data
public abstract class Earphones {

    private Color color;

    public Earphones(Color color) {
        super();
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s earphones", color);
    }

}
