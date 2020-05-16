package com.huey.learning.oop.designpattern.facade.subsystem;

import java.util.Optional;

public interface UserModule {

    boolean isUserExistent(String username);

    Optional<User> isPasswordMatched(String username, String password);

}
