package com.huey.learning.oop.designpattern.facade.subsystem;

public class SessionModuleImpl implements SessionModule {

    @Override
    public String generateSessionId() {
        return String.valueOf(Math.random());
    }

    @Override
    public void saveSession(String sessionId, User user) {
        // Our code for saving session
    }

}
