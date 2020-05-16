package com.huey.learning.oop.designpattern.facade.subsystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String username;
	private String password;
	private UserStatus status;
	
	public boolean isNormal() {
		return UserStatus.NORMAL.equals(this.status);
	}
	
}
