package com.huey.learning.oop.designpattern.chainofresponsibility;

import lombok.Data;

/**
 * 客户端请求
 *
 * @author huey
 */
@Data
public class ClientRequest {

    private String ip;
    private String captcha;
    private String username;
    private String password;

}
