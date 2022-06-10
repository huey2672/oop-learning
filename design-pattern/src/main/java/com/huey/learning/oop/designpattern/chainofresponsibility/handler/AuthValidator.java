package com.huey.learning.oop.designpattern.chainofresponsibility.handler;

import com.huey.learning.oop.designpattern.chainofresponsibility.ClientRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 认证校验器
 *
 * @author huey
 */
public class AuthValidator extends BaseValidator {

    private final static List<Account> ACCOUNT_LIST = new ArrayList<>();

    static {
        ACCOUNT_LIST.add(new Account("huey", "1qaz2wsx"));
        ACCOUNT_LIST.add(new Account("yuan", "3edc4rfv"));
    }

    public AuthValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(ClientRequest request) {
        if (!match(request.getUsername(), request.getPassword())) {
            System.err.println("密码校验失败");
            return false;
        }
        else {
            System.out.println("密码校验成功");
            return super.validate(request);
        }
    }

    /**
     * @param username
     * @param password
     * @return
     */
    private boolean match(String username, String password) {
        // 账号的匹配应该从数据库查询，但这里直接写死简化这个过程
        return ACCOUNT_LIST.stream()
                .anyMatch(account -> account.getUsername().equals(username)
                        && account.getPassword().equals(password)
                );
    }

    @Data
    @AllArgsConstructor
    static class Account {
        private String username;
        private String password;
    }

}
