package com.OrangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.CommoMethods.CommonMethods;

public class HomeOrangeHRMPage extends CommonMethods{
	
	// Lbl Name User
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement lbl_NameUser;
	
	
	public String getNameUserHome() {
		
		String txt = getTextElement(lbl_NameUser);
		
		return txt;
		
	}// end getNameUserHome
	

}// end HomeOrangeHRMPage
