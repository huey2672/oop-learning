package com.huey.learning.oop.designpattern.chainofresponsibility.handler;

import com.huey.learning.oop.designpattern.chainofresponsibility.ClientRequest;

/**
 * 校验器接口
 *
 * @author huey
 */
public interface Validator {

    /**
     * 校验请求
     *
     * @param request
     * @return
     */
    boolean validate(ClientRequest request);

}
