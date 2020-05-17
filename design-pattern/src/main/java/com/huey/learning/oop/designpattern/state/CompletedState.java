package com.huey.learning.oop.designpattern.state;

/**
 * Concrete state, completed
 *
 * @author huey
 */
public class CompletedState implements LeaveState {

    @Override
    public boolean nextStep(Leave leave) {
        System.out.println("This leave has been completed, you can't operate it any more.");
        return false;
    }

    @Override
    public boolean close(Leave leave) {
        System.out.println("This leave has been completed, you can't operate it any more.");
        return false;
    }

}
