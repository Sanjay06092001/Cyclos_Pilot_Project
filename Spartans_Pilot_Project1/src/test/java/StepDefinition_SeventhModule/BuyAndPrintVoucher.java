package StepDefinition_SeventhModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinition_ThirdModule.Repository;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyAndPrintVoucher {
	public static WebDriver driver;

	@When("The user launches url")
	public void the_user_launches_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
	}

	@When("logins to website")
	public void logins_to_website() throws InterruptedException {
		Thread.sleep(5000);
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

	@When("goes into market place tab")
	public void goes_into_market_place_tab() throws InterruptedException {
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.marketplace));
		Repository_7.marketplace.click();
	}

	@When("clicks my vouchers")
	public void clicks_my_vouchers() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.myvouchers));
		Repository_7.myvouchers.click();
	}

	@When("clicks on buy and email button")
	public void clicks_on_buy_and_email_button() throws InterruptedException {
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.buyandemail));
		Repository_7.buyandemail.click();
	}

	// end of background
	@When("user clicks cinema voucher")
	public void user_clicks_cinema_voucher() throws InterruptedException {
		Thread.sleep(3000);
		Repository_7.cinemavoucher.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.mail));
		Repository_7.mail.sendKeys("noreply@cyclos.org");
	}

	@When("enters the mail")
	public void enters_the_mail() throws InterruptedException {
		Thread.sleep(1000);
	}

	@When("clicks next in cinema voucher")
	public void clicks_next_in_cinema_voucher() {
		Repository_7.next.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.failuredisplay));
		boolean displayed2 = Repository_7.failuredisplay.isDisplayed();
		if (displayed2) {
			System.out.println("Cinema voucher " + Repository_7.failuredisplay.getText());
		}
	}

	@When("Click Confirm")
	public void click_confirm() throws InterruptedException {
	}

	@When("clicks print")
	public void clicks_print() throws InterruptedException {
	}

	@Then("Check if the transaction is successful")
	public void check_if_the_transaction_is_successful() {
	}

	@When("user clicks gift voucher")
	public void user_clicks_gift_voucher() throws InterruptedException {
		Thread.sleep(3000);
		Repository_7.cinemavoucher.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.mail));
		Repository_7.mail.sendKeys("noreply@cyclos.org");
	}

	@When("clicks next in gift voucher")
	public void clicks_next_in_gift_voucher() throws InterruptedException {
		Thread.sleep(1000);
		Repository_7.next.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.failuredisplay));
		boolean displayed2 = Repository_7.failuredisplay.isDisplayed();
		if (displayed2) {
			System.out.println("Gift voucher " + Repository_7.failuredisplay.getText());
		}
	}

	@When("user clicks restaurant voucher")
	public void user_clicks_restaurant_voucher() throws InterruptedException {
		Thread.sleep(3000);
		Repository_7.restaurantvoucher.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.mail));
		Repository_7.mail.sendKeys("noreply@cyclos.org");
	}

	@When("clicks next in restaurant voucher")
	public void clicks_next_in_restaurant_voucher() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Repository_7.next));
		Repository_7.next.click();
		wait.until(ExpectedConditions.visibilityOf(Repository_7.confirm));
		Repository_7.confirm.click();
		wait.until(ExpectedConditions.visibilityOf(Repository_7.print));
		Repository_7.print.click();
		wait.until(ExpectedConditions.visibilityOf(Repository_7.print));
		boolean displayed = Repository_7.print.isDisplayed();
		if (displayed) {
			System.out.println("Resturant voucher " + displayed);
		}
	}
}