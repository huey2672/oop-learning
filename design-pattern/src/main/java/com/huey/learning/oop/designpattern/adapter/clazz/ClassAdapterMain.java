package com.huey.learning.oop.designpattern.adapter.clazz;

import com.huey.learning.oop.designpattern.adapter.DuplexOutlet;
import com.huey.learning.oop.designpattern.adapter.DuplexPlug;

public class ClassAdapterMain {

    public static void main(String[] args) {

        DuplexOutlet duplexOutlet = new OutletAdapter();

        DuplexPlug duplexPlug = new DuplexPlug();
        duplexPlug.insert(duplexOutlet);

    }

}
