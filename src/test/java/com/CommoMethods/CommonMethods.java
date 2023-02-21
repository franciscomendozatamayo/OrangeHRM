package com.CommoMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static WebDriver startBrowser(String browserName) {

		try {
			
			switch (browserName) {

			case "firefox":

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;

			case "chrome":

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;

			case "edge":

				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;

			}// end switch
			
			wait = new WebDriverWait(driver, Duration.ofMinutes(2));

			return driver;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;

	}// end startBrowser
	
	
	

}// end CommonMethods
