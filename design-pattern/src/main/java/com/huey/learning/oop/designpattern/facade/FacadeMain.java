package com.huey.learning.oop.designpattern.facade;

import com.huey.learning.oop.designpattern.facade.facade.LoginFacade;
import com.huey.learning.oop.designpattern.facade.facade.LoginResult;

public class FacadeMain {

    public static void main(String[] args) {

        LoginFacade loginFacade = new LoginFacade();
        LoginResult loginResult = loginFacade.login("Mark", "abc");
        System.out.println(loginResult);

        loginResult = loginFacade.login("Mark", "abcdef");
        System.out.println(loginResult);

        loginResult = loginFacade.login("Huey", "123456");
        System.out.println(loginResult);

    }

}
