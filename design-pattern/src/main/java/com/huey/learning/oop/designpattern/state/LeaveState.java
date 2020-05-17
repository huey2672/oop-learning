package com.huey.learning.oop.designpattern.state;

/**
 * State
 *
 * @author huey
 */
public interface LeaveState {

    /**
     * changes the leave's state to next step
     *
     * @param leave
     * @return successfully or not
     */
    boolean nextStep(Leave leave);

    /**
     * closes the leave
     *
     * @param leave
     * @return successfully or not
     */
    boolean close(Leave leave);

}
