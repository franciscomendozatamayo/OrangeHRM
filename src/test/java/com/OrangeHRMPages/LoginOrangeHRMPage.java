package com.OrangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CommoMethods.CommonMethods;

public class LoginOrangeHRMPage extends CommonMethods {

	// Input Username
	@FindBy(xpath = "//input[@name='username']")
	WebElement input_Username;
	// Input Password
	@FindBy(xpath = "//input[@name='password']")
	WebElement input_Password;
	// Btn Login
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_Login;

	public void capturaUsername(String username) {

		sendKeysElement(input_Username, username);

	}// end capturaUsername

	public void capturaPassword(String password) {

		sendKeysElement(input_Password, password);

	}// end capturaPassword

	public void clickBtnLogin() {

		clickElement(btn_Login);

	}// end clickBtnLogin

}// end LoginOrangeHRMPage
