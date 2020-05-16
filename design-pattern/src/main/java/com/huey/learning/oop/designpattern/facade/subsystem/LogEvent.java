package com.huey.learning.oop.designpattern.facade.subsystem;

import java.util.Date;

import lombok.Data;

@Data
public abstract class LogEvent {

    protected Date logDate;
    protected LogType logType;

}
