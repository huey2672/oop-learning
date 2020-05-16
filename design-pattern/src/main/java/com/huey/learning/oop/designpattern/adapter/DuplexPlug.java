package com.huey.learning.oop.designpattern.adapter;

/**
 * target
 *
 * @author huey
 */
public class DuplexPlug {

    public void insert(DuplexOutlet duplexOutlet) {
        System.out.println("This is a duplex plug, it could inserts into a duplex outlet only.");
        duplexOutlet.useTwoHoles();
    }

}