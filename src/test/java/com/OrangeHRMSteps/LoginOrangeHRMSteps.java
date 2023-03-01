package com.OrangeHRMSteps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.CommoMethods.CommonMethods;
import com.OrangeHRMPages.HomeOrangeHRMPage;
import com.OrangeHRMPages.LoginOrangeHRMPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRMSteps extends CommonMethods{
	
	private LoginOrangeHRMPage loginOrangeHRMPage = PageFactory.initElements(driver, LoginOrangeHRMPage.class);
	private HomeOrangeHRMPage homeOrangeHRMPage = PageFactory.initElements(driver, HomeOrangeHRMPage.class);
	
	@Given("Cargar Pagina OrangeHRM {string}")
	public void Cargar_Pagina_OrangeHRM(String url) {
		
		driver.get(url);
		
	}// end Cargar_Pagina_OrangeHRM
	
	@When("Captura Username {string}")
	public void Captura_Username(String Username) {
		
		loginOrangeHRMPage.capturaUsername(Username);
		
	}// end Captura_Username
	
	@And("Captura Password {string}")
	public void Captura_Password(String Password) {
		
		loginOrangeHRMPage.capturaPassword(Password);
		
	}// end Captura_Password
	
	@And("Dar Click Boton Login")
	public void Dar_Click_Boton_Login() {
		
		loginOrangeHRMPage.clickBtnLogin();
		
	}// end Dar_Click_Boton_Login
	
	
	@Then("Muestra Nombre de Usuario {string} - Home OrangeHRM")
	public void Muestra_Nombre_de_Usuario_Home_OrangeHRM(String Name) {
	
		String NameUserActual = homeOrangeHRMPage.getNameUserHome();
		assertEquals(Name, NameUserActual);
		
	}// end Muestra_Nombre_de_Usuario_Home_OrangeHRM
	
	

}// end LoginOrangeHRMSteps
