package com.huey.learning.oop.designpattern.facade.subsystem;

public interface SessionModule {

    String generateSessionId();

    void saveSession(String sessionId, User user);

}
