package com.huey.learning.oop.designpattern.facade.subsystem;

import java.util.ArrayList;
import java.util.List;

public class LoggerModuleImpl implements LoggerModule {

    List<LogEvent> logEvents = new ArrayList<>();

    @Override
    public void log(LogEvent logEvent) {
        logEvents.add(logEvent);
    }

    @Override
    public void printLogs() {
        logEvents.forEach(e -> System.out.println(e));
    }

}
