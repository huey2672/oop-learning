package com.huey.learning.oop.designpattern.chainofresponsibility.handler;

import com.huey.learning.oop.designpattern.chainofresponsibility.ClientRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 白名单校验器
 */
public class WhiteListValidator extends BaseValidator {

    /**
     * 白名单列表
     */
    private static final List<String> WHITE_LIST = new ArrayList<>();

    static {
        WHITE_LIST.add("127.0.0.1");
        WHITE_LIST.add("192.168.1.101");
    }

    public WhiteListValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(ClientRequest request) {
        // 在白名单上的 IP 才能通过校验
        if (!isWhite(request.getIp())) {
            System.err.println("白名单校验失败");
            return false;
        }
        else {
            System.out.println("白名单校验通过");
            return super.validate(request);
        }
    }

    /**
     * 判断是否是白名单上的 IP
     *
     * @param ip
     * @return
     */
    private boolean isWhite(String ip) {
        // 白名单列表应该通过配置加载，但这里直接写死简化这个过程
        return WHITE_LIST.contains(ip);
    }

}
