package com.huey.learning.oop.designpattern.adapter.clazz;

import com.huey.learning.oop.designpattern.adapter.DuplexOutlet;
import com.huey.learning.oop.designpattern.adapter.TriplexOutlet;

/**
 * adapter
 *
 * @author huey
 */
public class OutletAdapter extends TriplexOutlet implements DuplexOutlet {

    @Override
    public void useTwoHoles() {
        System.out.println("This is an outlet adapter, it helps duplex plug adapt to triplex outlet.");
        this.useThreeHoles();
    }

}