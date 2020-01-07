package com.guvi.bs.action;

import com.guvi.bs.service.AuthService;

public class LoginAction {
	
	AuthService authservice = new AuthService();
	String strStatus;
	
	public String execute()
	{
		strStatus = authservice.validateUser("testuser", "123") ?"success":"failure";
		return strStatus;
	}

}
