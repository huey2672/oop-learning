package com.huey.learning.oop.designpattern.chainofresponsibility.handler;

import com.huey.learning.oop.designpattern.chainofresponsibility.ClientRequest;
import lombok.Setter;

/**
 * 基础校验器
 *
 * @author huey
 */
public abstract class BaseValidator implements Validator {

    /**
     * 链上的下一个校验器
     */
    protected Validator nextValidator;

    protected BaseValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public boolean validate(ClientRequest request) {
        if (nextValidator != null) {
            return nextValidator.validate(request);
        }
        return true;
    }

}
