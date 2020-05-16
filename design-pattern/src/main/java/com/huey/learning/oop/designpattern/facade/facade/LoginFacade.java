package com.huey.learning.oop.designpattern.facade.facade;

import java.util.Optional;

import com.huey.learning.oop.designpattern.facade.subsystem.LoggerModule;
import com.huey.learning.oop.designpattern.facade.subsystem.LoggerModuleImpl;
import com.huey.learning.oop.designpattern.facade.subsystem.LoginEvent;
import com.huey.learning.oop.designpattern.facade.subsystem.SessionModule;
import com.huey.learning.oop.designpattern.facade.subsystem.SessionModuleImpl;
import com.huey.learning.oop.designpattern.facade.subsystem.User;
import com.huey.learning.oop.designpattern.facade.subsystem.UserModule;
import com.huey.learning.oop.designpattern.facade.subsystem.UserModuleImpl;
import lombok.Data;

@Data
public class LoginFacade {
	
	private UserModule userModule = new UserModuleImpl();
	private LoggerModule loggerModule = new LoggerModuleImpl();
	private SessionModule sessionModule = new SessionModuleImpl();
	
	public LoginResult login(String username, String password) {
		if (!userModule.isUserExistent(username)) {
			return LoginResult.fail("Counld not find the user[" + username + "].");
		}
		
		Optional<User> userOpt = userModule.isPasswordMatched(username, password);
		if (!userOpt.isPresent()) {
			return LoginResult.fail("The password is not matched.");
		}
		
		User user = userOpt.get();
		if (!user.isNormal()) {
			return LoginResult.fail("The user is unavailable.");
		}
		
		String sessionId = sessionModule.generateSessionId();
		sessionModule.saveSession(sessionId, user);
		
		loggerModule.log(new LoginEvent(username));
		
		return LoginResult.success("Login successfully.");
	}

}
