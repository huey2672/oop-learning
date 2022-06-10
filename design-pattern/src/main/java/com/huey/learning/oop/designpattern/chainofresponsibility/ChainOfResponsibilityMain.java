package com.huey.learning.oop.designpattern.chainofresponsibility;

import com.huey.learning.oop.designpattern.chainofresponsibility.handler.AuthValidator;
import com.huey.learning.oop.designpattern.chainofresponsibility.handler.WhiteListValidator;
import com.huey.learning.oop.designpattern.chainofresponsibility.handler.CaptchaValidator;
import com.huey.learning.oop.designpattern.chainofresponsibility.handler.Validator;

/**
 * @author huey
 */
public class ChainOfResponsibilityMain {

    public static void main(String[] args) {

        Validator validatorChain = getValidatorChain();

        ClientRequest clientRequest = new ClientRequest();
        clientRequest.setIp("127.0.0.1");
        clientRequest.setCaptcha("1qaz");
        clientRequest.setUsername("huey");
        clientRequest.setPassword("1qaz2wsx");

        boolean validated = validatorChain.validate(clientRequest);
        if (validated) {
            System.out.println("请求通过校验");
        }
        else {
            System.err.println("请求没有通过校验");
        }

    }

    private static Validator getValidatorChain() {
        Validator authValidator = new AuthValidator(null);
        Validator captchaValidator = new CaptchaValidator(authValidator);
        Validator whiteListValidator = new WhiteListValidator(captchaValidator);
        return whiteListValidator;
    }

}
