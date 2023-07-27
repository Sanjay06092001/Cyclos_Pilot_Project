package StepDefinition_FirstModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
		Thread.sleep(3000);
//		Actions act=new Actions(driver);
//		act.keyDown(Keys.CONTROL)
		StepRepo.profile.click();
		Thread.sleep(3000);
		StepRepo.edit.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Enter Address and email")
	public void enter_address_and_email() throws InterruptedException {
		PageFactory.initElements(driver,StepRepo.class);
		//WebDriverWait wait = new WebDriverWait(driver, 8);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
		StepRepo.addressRegion.sendKeys("Goa");
		
		StepRepo.email.clear();
		StepRepo.email.sendKeys("Praju776@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Enter city")
	public void enter_city() {
		PageFactory.initElements(driver,StepRepo.class);
		StepRepo.City.clear();
		StepRepo.City.sendKeys("Chennai");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click save")
	public void i_need_to_click_save() throws InterruptedException {
		StepRepo.Save.click();
		Thread.sleep(2000);
		driver.navigate().back();
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Given("As a user I should click on edit button")
	public void as_a_user_i_should_click_on_edit_button() {
		PageFactory.initElements(driver,StepRepo.class);
		StepRepo.edit.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to  click on Add address button")
	public void i_need_to_click_on_add_address_button() {
		StepRepo.clickAddress.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click on name text field")
	public void i_need_to_click_on_name_text_field() {
		StepRepo.AddaddressName.click();
		StepRepo.AddaddressName.clear();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Enter the valid name in text field.")
	public void enter_the_valid_name_in_text_field() {
		
		StepRepo.AddaddressName.sendKeys("aabbcc");
	   
	}

	@Then("I need to  click on AddressLine1 Text field.")
	public void i_need_to_click_on_address_line1_text_field() {
		StepRepo. Addressline.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I need to enter a valid address in the text field")
	public void i_need_to_enter_a_valid_address_in_the_text_field() {
		StepRepo.Addressline.clear();
		StepRepo.Addressline.sendKeys("ABC@dsc");
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("I need to click on City Tex t input")
	public void i_need_to_click_on_city_tex_t_input() {
		StepRepo.City1.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("have to  enetr the city name")
	public void have_to_enetr_the_city_name() {
		StepRepo.City1.clear();
		StepRepo.City1.sendKeys("Thailand");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I Need to click on zipcode Textfield")
	public void i_need_to_click_on_zipcode_textfield() {
		StepRepo.AddZipcode.click();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("enetr the valid zipcode")
	public void enetr_the_valid_zipcode() {
		StepRepo.AddZipcode.clear();
		StepRepo.AddZipcode.sendKeys("232445");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click the save button")
	public void click_the_save_button() throws InterruptedException {
		StepRepo.save3.click();
		Thread.sleep(2000);
		driver.navigate().back();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("As a user I need to  click on edit button")
	public void as_a_user_i_need_to_click_on_edit_button() {
		StepRepo.edit.click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I need to click  add mobile button")
	public void i_need_to_click_add_mobile_button() {
		StepRepo. Addmobilebtn.click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the Mobile phone name Text field")
	public void i_click_the_mobile_phone_name_text_field() {
		StepRepo. mobilephonename.click();
		StepRepo. mobilephonename.clear();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I need to  enter the valid phone number name")
	public void i_need_to_enter_the_valid_phone_number_name() {
		StepRepo.mobilephonename.sendKeys("Karthick");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I click the mobile phone number text field")
	public void i_click_the_mobile_phone_number_text_field() {
		StepRepo.mobilephoneno.click();
		StepRepo.mobilephoneno.clear();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I need to enter the correct phone number")
	public void i_need_to_enter_the_correct_phone_number() {
		StepRepo.mobilephoneno.sendKeys("9007654321");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click on Add Mobile Number button to save")
	public void click_on_add_mobile_number_button_to_save() {
		StepRepo.Save.click();
		driver.navigate().back();
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given("As a user I need to  click on Profile button")
	public void as_a_user_i_need_to_click_on_profile_button() {
		StepRepo.profile.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("I need to  click on Password button")
	public void i_need_to_click_on_password_button() {
		StepRepo.Passwordbutton.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I click on change button")
	public void i_click_on_change_button() {
		StepRepo.changebutton.click();
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click on Old password Text field")
	public void i_need_to_click_on_old_password_text_field() {
		StepRepo.Oldpassinput.click();
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("enter the valid Password in password text field")
	public void enter_the_valid_password_in_password_text_field() {
		StepRepo.Oldpassinput.clear();
		StepRepo.Oldpassinput.sendKeys("Praju@143$");
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to  click on new password text field")
	public void i_need_to_click_on_new_password_text_field() {
		StepRepo.Newpassinput.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("enter the valid new Password in new password text field")
	public void enter_the_valid_new_password_in_new_password_text_field() {
		StepRepo.Newpassinput.sendKeys("Praju@143$");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("again I need to enter new password for confirmation")
	public void again_i_need_to_enter_new_password_for_confirmation() {
		StepRepo. againnewpassword.sendKeys("Praju@143");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click the Submit button")
	public void click_the_submit_button() {
		StepRepo.submit.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("As a user I need to click profile button")
	public void as_a_user_i_need_to_click_profile_button() {
		StepRepo.profile.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I  click on the notification button")
	public void i_click_on_the_notification_button() {
	    // Write code here that turns the phrase above into concrete actions
	    StepRepo.Notifybutton.click();
	}

	@Then("I need to click on the unread check box")
	public void i_need_to_click_on_the_unread_check_box() {
		StepRepo.checkbox.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("As a user I need to click on the Profile button")
	public void as_a_user_i_need_to_click_on_the_profile_button() {
		StepRepo.profile.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click on Contacts button")
	public void i_need_to_click_on_contacts_button() {
		StepRepo.Contactbutton.click();
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I need to click List View in first profile")
	public void i_need_to_click_list_view_in_first_profile() {
	    // Write code here that turns the phrase above into concrete actions
	   StepRepo.listview.click();
	   
	   
	   ExtentCucumberAdapter.addTestStepLog(Status.PASS+"Successfully Passed");
	}


}

   




