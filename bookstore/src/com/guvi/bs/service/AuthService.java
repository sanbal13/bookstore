package com.guvi.bs.service;

public class AuthService {

	public boolean validateUser(String username, String pwd) {
		
		if(username.equalsIgnoreCase("testuser") && pwd.equals("123"))
			return true;
		else
			return false;
	}
}
