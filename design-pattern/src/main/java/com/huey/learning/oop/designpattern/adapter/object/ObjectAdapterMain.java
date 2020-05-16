package com.huey.learning.oop.designpattern.adapter.object;

import com.huey.learning.oop.designpattern.adapter.DuplexOutlet;
import com.huey.learning.oop.designpattern.adapter.DuplexPlug;
import com.huey.learning.oop.designpattern.adapter.TriplexOutlet;

public class ObjectAdapterMain {

    public static void main(String[] args) {

        TriplexOutlet triplexOutlet = new TriplexOutlet();
        DuplexOutlet duplexOutlet = new OutletAdapter(triplexOutlet);

        DuplexPlug duplexPlug = new DuplexPlug();
        duplexPlug.insert(duplexOutlet);

    }

}
