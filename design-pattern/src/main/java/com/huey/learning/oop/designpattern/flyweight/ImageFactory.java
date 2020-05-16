package com.huey.learning.oop.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {

    private static Map<String, Image> imageCache = new HashMap<String, Image>();

    public static Image createImage(String path) {

        Image image;
        if (imageCache.containsKey(path)) {
            image = imageCache.get(path);
        } else {
            image = new Image(path);
            imageCache.put(path, image);
        }

        return image;

    }

}
