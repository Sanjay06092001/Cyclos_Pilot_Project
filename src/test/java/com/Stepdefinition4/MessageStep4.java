package com.Stepdefinition4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Stepdefinition.Messageclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MessageStep4 {
	public static WebDriver driver;
@Given("Launch the cyclos url {string}")
public void launch_the_cyclos_url(String string) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	PageFactory.initElements(driver,Messageclass4.class);
}

@When("Click the login button")
public void click_the_login_button() {
    System.out.println("login");
}

@When("Login with username {string} and password {string}")
public void login_with_username_and_password(String string, String string2) {
    System.out.println("user and pass");
}

@When("Click submit with valid credentials")
public void click_submit_with_valid_credentials() throws InterruptedException {
	Thread.sleep(2000);
  Messageclass4.submit.click();
}

@When("Click messages icon")
public void click_messages_icon() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I have to Click the inbox radio button")
public void i_have_to_click_the_inbox_radio_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Select the user from dropdown")
public void select_the_user_from_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the Keyword for index as {string}")
public void enter_the_keyword_for_index_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the user as {string}")
public void enter_the_user_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click the inbox message history")
public void click_the_inbox_message_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("I have to Click the sent radio button")
public void i_have_to_click_the_sent_radio_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Select sent to as user")
public void select_sent_to_as_user() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the Keyword for sent as {string}")
public void enter_the_keyword_for_sent_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Select the user as {string}")
public void select_the_user_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click the sent message history")
public void click_the_sent_message_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Click the trash radio button")
public void click_the_trash_radio_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Select the sent to as administration")
public void select_the_sent_to_as_administration() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the keyword of trash as {string}")
public void enter_the_keyword_of_trash_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click the trash message history")
public void click_the_trash_message_history() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}
