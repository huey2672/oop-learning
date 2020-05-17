package com.huey.learning.oop.designpattern.state;

/**
 * @author huey
 */
public class Manager {

    public void approveLeave(Leave leave) {
        System.out.println("The manager is approving the leave application.");
        if (leave.nextStep()) {
            leave.setApprover(this);
        }
    }

    public void disapproveLeave(Leave leave) {
        System.out.println("The manager is disapproving the leave application.");
        if (leave.close()) {
            leave.setApprover(this);
        }
    }

}
