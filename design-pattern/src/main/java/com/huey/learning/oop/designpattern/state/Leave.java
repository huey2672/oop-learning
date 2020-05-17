package com.huey.learning.oop.designpattern.state;

import lombok.Data;

import java.util.Date;

/**
 * @author huey
 */
@Data
public class Leave {

    private Staff initiator;
    private Manager approver;
    private Date startDate;
    private Date endDate;
    private String reason;
    private LeaveState currentState;


    public Leave(Staff initiator, Date startDate, Date endDate, String reason) {
        this.initiator = initiator;
        this.startDate = startDate;
        this.endDate = startDate;
        this.reason = reason;
        this.currentState = new DraftState();
    }

    public boolean nextStep() {
        return currentState.nextStep(this);
    }

    public boolean close() {
        return currentState.close(this);
    }

}
