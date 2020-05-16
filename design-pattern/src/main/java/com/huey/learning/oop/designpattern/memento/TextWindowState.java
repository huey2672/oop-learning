package com.huey.learning.oop.designpattern.memento;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Memento
 *
 * @author huey
 */
@EqualsAndHashCode
public class TextWindowState {

    @Getter
    private String text;

    public TextWindowState(String text) {
        this.text = text;
    }

}