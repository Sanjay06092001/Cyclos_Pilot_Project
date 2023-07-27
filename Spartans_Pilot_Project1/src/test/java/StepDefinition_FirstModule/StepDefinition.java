package StepDefinition_FirstModule;

import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public static WebDriver driver;

	@Before

	public static void config() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	private FluentWait<WebDriver> wait;

	@Given("Launch the Application")

	public void launch_the_application() throws InterruptedException {

		driver.get("https://demo.cyclos.org/ui/login");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		PageFactory.initElements(driver, UserRepository.class);

	}

	@Given("Enter User Name")

	public void enter_user_name() {

		UserRepository.username.click();

		UserRepository.username.sendKeys("Praju");

	}

	@When("Enter Password")

	public void enter_password() {

		UserRepository.userpassword.click();

		UserRepository.userpassword.sendKeys("Praju@113$");

		UserRepository.Submit.click();

	}

	@Then("Click profile and click Edit")

	public void click_profile_and_click_edit() throws InterruptedException {

		UserRepository.profile.click();

		UserRepository.edit.click();

	}

	@When("Enter email")

	public void enter_email() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		UserRepository.email.clear();

		wait.until(ExpectedConditions.visibilityOf(UserRepository.email));

		UserRepository.email.sendKeys("rr9062843@gmail.com");

	}

	@Then("Enter Address")

	public void enter_address() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		UserRepository.addressRegion.clear();

		wait.until(ExpectedConditions.visibilityOf(UserRepository.addressRegion));

		UserRepository.addressRegion.sendKeys("No- 31 Tambaram");

	}

	@When("Enter City")

	public void enter_city() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		UserRepository.city.clear();

		wait.until(ExpectedConditions.visibilityOf(UserRepository.city));

		UserRepository.city.sendKeys("Chennai");

	}

	@Then("Click Save")

	public void click_save() {

	}

	@Given("User should click on edit button")

	public void user_should_click_on_edit_button() {

	}

	@Given("click on Add address button")

	public void click_on_add_address_button() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// UserRepository.city.clear();

		// wait.until(ExpectedConditions.visibilityOf(UserRepository.city));

		// UserRepository.city.sendKeys("Chennai");

		Thread.sleep(3000);

		UserRepository.Addaddress.click();

	}

	@Then("click on name text field")

	public void click_on_name_text_field() {

	}

	@Then("enter the valid name")

	public void enter_the_valid_name() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// //UserRepository.city.clear();

		// wait.until(ExpectedConditions.visibilityOf(UserRepository.AddaddressName));

		// UserRepository.AddaddressName.sendKeys("ruban chakravarthy");

		Thread.sleep(3000);

		UserRepository.AddaddressName.sendKeys("rubanchakravarthy");

	}

	@Then("click on Address line1 text field")

	public void click_on_address_line1_text_field() {

	}

	@Then("enter the valid Address line1")

	public void enter_the_valid_address_line1() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// //UserRepository.city.clear();

		// wait.until(ExpectedConditions.visibilityOf(UserRepository.Addaddressline1));

		// UserRepository.Addaddressline1.sendKeys("No-14 Korattur");

		Thread.sleep(3000);

		UserRepository.Addaddressline1.sendKeys("No-14 Tambaram");

	}

	@Then("Click on city text field")

	public void click_on_city_text_field() {

	}

	@Then("enter the valid city")

	public void enter_the_valid_city() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// //UserRepository.city.clear();

		// wait.until(ExpectedConditions.visibilityOf(UserRepository.city1));

		// UserRepository.city1.sendKeys("Thiruvallur");

		Thread.sleep(3000);

		UserRepository.city1.sendKeys("Chennai");

	}

	@Then("Click on Zipcode text field")

	public void click_on_zipcode_text_field() {

	}

	@Then("enter the valid Zipcode")

	public void enter_the_valid_zipcode() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// //UserRepository.city.clear();

		// wait.until(ExpectedConditions.visibilityOf(UserRepository.Zipcode));

		// UserRepository.Zipcode.sendKeys("600050");

		Thread.sleep(3000);

		UserRepository.Zipcode.sendKeys("600080");

	}

	@Then("click on save button")

	public void click_on_save_button() throws InterruptedException {

	}

	@Given("User should click on AddMobile phone button")

	public void user_should_click_on_add_mobile_phone_button() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.addmobilephones));

		UserRepository.addmobilephones.click();

	}

	@Then("click on Mobile phone name text field")

	public void click_on_mobile_phone_name_text_field() {

	}

	@Then("enter valid Mobile phone name")

	public void enter_valid_mobile_phone_name() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.mobilephonename));

		UserRepository.mobilephonename.sendKeys("rub");

	}

	@Then("click on Mobile phone number text field")

	public void click_on_mobile_phone_number_text_field() {

	}

	@Then("enter valid Mobile phone number")

	public void enter_valid_mobile_phone_number() {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.mobilephoneno));

		UserRepository.mobilephoneno.sendKeys("(210) 555-0122");

	}

	@Then("click on Add Multiple Phone button")

	public void click_on_add_multiple_phone_button() {

	}

	@Given("Click on Profile button")

	public void click_on_profile_button1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-350)");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile));

		JavascriptExecutor jsc = (JavascriptExecutor) driver;

		UserRepository.profile.click();

	}

	@Given("Click on password")

	public void click_on_password() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 30);

		wait1.until(ExpectedConditions.visibilityOf(UserRepository.password1));

		UserRepository.password1.click();

	}

	@Then("click on Change button")

	public void click_on_change_button() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.changebutton));

		UserRepository.changebutton.click();

	}

	@Then("enter the valid password in old password text field")

	public void enter_the_valid_password_in_old_password_text_field() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.oldpassword));

		UserRepository.oldpassword.sendKeys("Praju@113$");

	}

	@Then("enter the valid password in new password text field")

	public void enter_the_valid_password_in_new_password_text_field() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.newpassword));

		UserRepository.newpassword.sendKeys("Praju@113$");

		// Thread.sleep(3000);

	}

	@Then("enter the valid password in password confirmation text field")

	public void enter_the_valid_password_in_password_confirmation_text_field() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.againnewpassword));

		UserRepository.againnewpassword.sendKeys("Praju@113$");

	}

	@Then("Click on Submit button")

	public void click_on_submit_button() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.submit2));

		UserRepository.submit2.click();

	}

	@Given("Click on the Profile button")

	public void click_on_the_profile_button() throws InterruptedException {

	}

	@Then("Click on notification")

	public void click_on_notification() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.notification));

		UserRepository.notification.click();

	}

	@Then("Click on unread checkbox")

	public void click_on_unread_checkbox() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.checkbox));

		UserRepository.checkbox.click();

	}

	@Given("Click on profile button")

	public void click_on_profile_button() throws InterruptedException {

	}

	@Then("Click on contacts")

	public void click_on_contacts() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.contacts));

		UserRepository.contacts.click();

	}

	@Then("Click on list view")

	public void click_on_list_view() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(UserRepository.listview));

		UserRepository.listview.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");

	}

}
