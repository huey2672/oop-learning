package com.huey.learning.oop.designpattern.facade.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResult {
	
	private ResultCode resultCode;
	private String message;
	
	public static LoginResult success(String message) {
		return new LoginResult(ResultCode.SUCCESS, message);
	}
	
	public static LoginResult fail(String message) {
		return new LoginResult(ResultCode.FAILED, message);
	}

}
