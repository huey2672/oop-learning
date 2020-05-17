package com.huey.learning.oop.designpattern.state;

import java.util.Date;

/**
 * A case of state pattern
 *
 * @author huey
 */
public class StateMain {

    public static void main(String[] args) {

        Date today = new Date();

        // the staff asks for leave
        Staff staff = new Staff();
        Leave leave = staff.askForLeave(today, today, "personal affairs");
        staff.submitLeave(leave);

        // the manager approves the application
        Manager manager = new Manager();
        manager.approveLeave(leave);

    }

}
