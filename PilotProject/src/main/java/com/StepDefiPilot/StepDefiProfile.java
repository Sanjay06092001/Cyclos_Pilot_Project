package com.StepDefiPilot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefiProfile {
	public WebDriver driver;
	
	@Before
	public void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver,StepRepo.class);
		
	}
	@Given("As a user I want to launch the appication.")
	public void as_a_user_i_want_to_launch_the_appication() {
	    driver.get("https://demo.cyclos.org/ui/login");
	}

	@And("I need to enter the username")
	public void I_need_to_enter_the_username() throws InterruptedException {
		Thread.sleep(3000);
		StepRepo.username.sendKeys("Praju");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@And("need to the Enter password")
	public void need_to_the_enter_password() {
		PageFactory.initElements(driver,StepRepo.class);
		StepRepo.password.sendKeys("Praju@143$");
		StepRepo.submit1.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I click profile and click edit")
	public void i_click_profile_and_click_edit() throws InterruptedException {
		
		StepRepo.profile.click();
		Thread.sleep(3000);
		StepRepo.edit1.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Enter Address and email")
	public void enter_address_and_email() throws InterruptedException {
		
		StepRepo.address.clear();
		Thread.sleep(3000);
		StepRepo.address.sendKeys("XYZ");
		StepRepo.email.clear();
		StepRepo.email.sendKeys("aarun776@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Enter city")
	public void enter_city() {
		StepRepo.City.clear();
		StepRepo.City.sendKeys("Chennai");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click save")
	public void i_need_to_click_save() {
		StepRepo.Save.click();
	    // Write code here that turns the phrase above into concrete actions
	  
	}

   
}



