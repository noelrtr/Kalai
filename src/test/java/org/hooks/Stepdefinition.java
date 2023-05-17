package org.hooks;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	

	@When("user should enter the username and passwordone")
	public void user_should_enter_the_username_and_passwordone() {
		findElementId("email").sendKeys("Noel");
		findElementId("pass").sendKeys("Noel@01");
		System.out.println("step2");
		
	}
	@When("user should click the login buttonone")
	public void user_should_click_the_login_buttonone() {
		
		WebElement login = findElementXpath("//button[text()='Log in']");
		login.click();
		System.out.println("step3");
		
	}




}
