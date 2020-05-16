package com.huey.learning.oop.designpattern.facade.subsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserModuleImpl implements UserModule {

    private List<User> users = new ArrayList<>();

    public UserModuleImpl() {
        users.add(new User("Huey", "123456", UserStatus.NORMAL));
        users.add(new User("Mark", "abcdef", UserStatus.FROZEN));
    }

    @Override
    public boolean isUserExistent(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findAny().isPresent();
    }

    @Override
    public Optional<User> isPasswordMatched(String username, String password) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst();
    }

}
