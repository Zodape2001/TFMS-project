package com.revature.app;

import com.revature.constant.Constant;
import com.revature.service.impl.LoginImpl;

public class Application {

	Constant constant = new Constant();	
	public static void main(String[] args) throws Exception {
		LoginImpl loginImpl = new LoginImpl();
		loginImpl.login();
		
	}
}
