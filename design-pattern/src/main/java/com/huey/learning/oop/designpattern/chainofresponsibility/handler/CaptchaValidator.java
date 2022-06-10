package com.huey.learning.oop.designpattern.chainofresponsibility.handler;

import com.huey.learning.oop.designpattern.chainofresponsibility.ClientRequest;

/**
 * 验证码校验器
 *
 * @author huey
 */
public class CaptchaValidator extends BaseValidator {

    private static final String CAPTCHA = "1QAZ";

    public CaptchaValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(ClientRequest request) {
        if (!match(request.getCaptcha())) {
            System.err.println("验证码校验失败");
            return false;
        }
        else {
            System.out.println("验证码校验通过");
            return super.validate(request);
        }
    }

    private boolean match(String captcha) {
        // 验证码应该随机生成，但这里直接写死简化这个过程
        return CAPTCHA.equalsIgnoreCase(captcha);
    }

}
