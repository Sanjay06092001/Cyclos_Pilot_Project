package StepDefinition_SeventhModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import StepDefinition_ThirdModule.Repository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintVoucher {
	public static WebDriver driver;
	@Given("The user logs in with the valid credentails")
	public void the_user_logs_in_with_the_valid_credentails() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.cyclos.org/ui/home");
	WebDriverWait wait = new WebDriverWait(driver, 30);
	PageFactory.initElements(driver, Repository.class);
	PageFactory.initElements(driver, Repository_7.class);
	wait.until(ExpectedConditions.visibilityOf(Repository.login));
	Repository.login.click();
	wait.until(ExpectedConditions.visibilityOf(Repository.username));
	Repository.username.sendKeys("Demo");
	wait.until(ExpectedConditions.visibilityOf(Repository.password));
	Repository.password.sendKeys("1234");
	wait.until(ExpectedConditions.visibilityOf(Repository.submit));
	Repository.submit.click();
	}
	@Given("is in the marketplace tab")
	public void is_in_the_marketplace_tab() throws InterruptedException {
	Thread.sleep(5000);
	Repository_7.marketplace.click();
	}
	@Given("is in my vouchers")
	public void is_in_my_vouchers() throws InterruptedException {
	Thread.sleep(5000);
	Repository_7.myvouchers.click();
	}
	@When("I click on one of my vouchers")
	public void i_click_on_one_of_my_vouchers() throws InterruptedException {
	Thread.sleep(5000);
	Repository_7.voucher.click();
	}
	@When("click print")
	public void click_print() throws InterruptedException {
	Thread.sleep(5000);
	Repository_7.print.click();
	}
	@Then("I download the voucher")
	public void i_download_the_voucher() throws InterruptedException {
	Thread.sleep(5000);
	}
	@Then("print the voucher")
	public void print_the_voucher() {
	String text = Repository_7.printincon.getText();
	System.out.println(text);
	ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
	}
}