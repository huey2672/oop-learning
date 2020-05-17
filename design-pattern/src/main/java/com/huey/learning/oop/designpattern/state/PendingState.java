package com.huey.learning.oop.designpattern.state;

/**
 * Concrete state, pending
 *
 * @author huey
 */
public class PendingState implements LeaveState {

    @Override
    public boolean nextStep(Leave leave) {
        leave.setCurrentState(new CompletedState());
        System.out.println("This leave is completed now.");
        return true;
    }

    @Override
    public boolean close(Leave leave) {
        leave.setCurrentState(new ClosedState());
        System.out.println("This leave is closed now.");
        return true;
    }

}
