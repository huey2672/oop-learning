package com.huey.learning.oop.designpattern.adapter.object;

import com.huey.learning.oop.designpattern.adapter.DuplexOutlet;
import com.huey.learning.oop.designpattern.adapter.TriplexOutlet;

/**
 * adapter
 *
 * @author huey
 */
public class OutletAdapter implements DuplexOutlet {

    private TriplexOutlet triplexOutlet;

    public OutletAdapter(TriplexOutlet triplexOutlet) {
        this.triplexOutlet = triplexOutlet;
    }

    @Override
    public void useTwoHoles() {
        System.out.println("This is an outlet adapter, it helps duplex plug adapt to triplex outlet.");
        triplexOutlet.useThreeHoles();
    }

}