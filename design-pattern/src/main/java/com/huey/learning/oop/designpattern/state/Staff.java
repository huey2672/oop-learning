package com.huey.learning.oop.designpattern.state;

import java.util.Date;

/**
 * @author huey
 */
public class Staff {

    public Leave askForLeave(Date startDate, Date endDate, String reason) {
        System.out.println("The staff is asking for leave.");
        return new Leave(this, startDate, endDate, reason);
    }

    public void submitLeave(Leave leave) {
        System.out.println("The staff is submitting the leave application.");
        leave.nextStep();
    }

    public void withdrawLeave(Leave leave) {
        System.out.println("The staff is withdrawing the leave application.");
        leave.close();
    }

}
