package com.huey.learning.oop.designpattern.flyweight;

import lombok.Getter;

public class Image {

    @Getter
    private byte[] data;

    public Image(String path) {

        System.out.println("New an image of " + path);
        // Just mocking
        this.data = path.getBytes();

    }

}
