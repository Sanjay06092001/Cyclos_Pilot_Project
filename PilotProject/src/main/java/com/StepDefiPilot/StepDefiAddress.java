package com.StepDefiPilot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefiAddress {
	public WebDriver driver;

	@Before
	public void config()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver,StepRepo.class);
		
	}
	@Given("As a user I should click on edit button")
	public void as_a_user_i_should_click_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I need to  click on Add address button")
	public void i_need_to_click_on_add_address_button() {
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I need to click on name text field")
	public void i_need_to_click_on_name_text_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the valid name in text field.")
	public void enter_the_valid_name_in_text_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I need to  click on AddressLine1 Text field.")
	public void i_need_to_click_on_address_line1_text_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I need to enter a valid address in the text field")
	public void i_need_to_enter_a_valid_address_in_the_text_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I need to click on City Tex t input")
	public void i_need_to_click_on_city_tex_t_input() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("have to  enetr the city name")
	public void have_to_enetr_the_city_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I Need to click on zipcode Textfield")
	public void i_need_to_click_on_zipcode_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("enetr the valid zipcode")
	public void enetr_the_valid_zipcode() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click the save button")
	public void click_the_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
