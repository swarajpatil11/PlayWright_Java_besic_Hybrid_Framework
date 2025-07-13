package com.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class loginpage {

	Locator Email;
	Locator Password;
	Locator SignIn;
	
	public loginpage (Page page) {
		this.Email=page.locator("#email");
		this.Password=page.locator("#password");
		this.SignIn=page.locator("xpath=//*[@id=\"form\"]/div[3]/div/button");
		
		
	}
	public void Login(String user , String pass) {
		
		Email.fill(user);
		Password.fill(pass);
		SignIn.click();
		
	}
	
}
