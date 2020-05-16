package com.huey.learning.oop.designpattern.proxy;

import lombok.Getter;

public class Visitor {

    @Getter
    private boolean VIP = Boolean.FALSE;

    public void buyMemberships() {
        this.VIP = Boolean.TRUE;
    }

}
