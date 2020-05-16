package com.huey.learning.oop.designpattern.facade.subsystem;

public interface LoggerModule {

    void log(LogEvent logEvent);

    void printLogs();

}
