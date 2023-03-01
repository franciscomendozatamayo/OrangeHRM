package com.CommoMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

	public void sendKeysElement(WebElement element, String txt) {

		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(txt);

	}// end sendKeysElement

	public void clickElement(WebElement element) {

		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}// end clickElement
	
	public String getTextElement(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
		String txt = element.getText();

		return txt;

	}// end getTestElement

}// end CommonMethods
