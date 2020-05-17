package com.huey.learning.oop.designpattern.state;

/**
 * Concrete state, draft
 *
 * @author huey
 */
public class DraftState implements LeaveState {

    @Override
    public boolean nextStep(Leave leave) {
        leave.setCurrentState(new PendingState());
        System.out.println("This leave is pending now.");
        return true;
    }

    @Override
    public boolean close(Leave leave) {
        leave.setCurrentState(new ClosedState());
        System.out.println("This leave is closed now.");
        return true;
    }

}
