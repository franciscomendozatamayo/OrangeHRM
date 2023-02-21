package com.OrangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrangeHRMPage {
	
	
	// Input Username
	@FindBy(css = "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input")
	WebElement input_Username;
	// Input Password
	@FindBy(css = "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input")
	WebElement input_Password;
	// Btn Login
	@FindBy(css = "#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
	WebElement btn_Login;
	
	

}// end LoginOrangeHRMPage
