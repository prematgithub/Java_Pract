package com.facebook.pages;

import com.facebook.genericPage.CommonFunctions;

public class LoginPage extends CommonFunctions {

	public LoginPage() throws Exception {
		super();
	}

	// Click Email or Phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter email or phone
	public void enterEmailOrPhone(String username) {
		enterData("EmailOrPhone", username);
	}

	// Click Password
	public void clickPassword() {
		click("Password");
	}

	// Enter email or phone
	public void enterPassword(String password) {
		enterData("Password", password);
	}
	//Click Login button
	public void clickLoginButton() {
		click("LoginButton");
	}
	public void clearEmailOrPhone() {
		click("EmailOrPhone");
	}
	public void clearPassword() {
		click("Password");
	}

}
