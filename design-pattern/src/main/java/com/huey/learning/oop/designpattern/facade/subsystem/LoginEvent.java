package com.huey.learning.oop.designpattern.facade.subsystem;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LoginEvent extends LogEvent {

    private String username;

    public LoginEvent(String username) {
        this.logDate = new Date();
        this.logType = LogType.LOGIN;
        this.username = username;
    }

}
