package com.huey.learning.oop.designpattern.state;

/**
 * Concrete state, closed
 *
 * @author huey
 */
public class ClosedState implements LeaveState {

    @Override
    public boolean nextStep(Leave leave) {
        System.out.println("This leave has been closed, you can't operate it any more.");
        return false;
    }

    @Override
    public boolean close(Leave leave) {
        System.out.println("This leave has been closed, you can't operate it any more.");
        return false;
    }

}
