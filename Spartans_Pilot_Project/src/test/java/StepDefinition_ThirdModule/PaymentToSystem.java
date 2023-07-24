package StepDefinition_ThirdModule;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentToSystem {
	public static WebDriver driver;
	@Given("User should launch the cyclos website and login with  valid credentials")
	public void user_should_launch_the_cyclos_website_and_login_with_valid_credentials() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://cyclos.org");
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   PageFactory.initElements(driver, Repository.class);
	   Repository.product.click();
	   String parent=driver.getWindowHandle();
	   Repository.visitOnlineDemo.click();
	   Set<String>s=driver.getWindowHandles();
	   Iterator<String> I= s.iterator();
	   while(I.hasNext())
	   {
	   String child_window=I.next();
	   if(!parent.equals(child_window))
	   {
	   driver.switchTo().window(child_window);
	   }
	   }
	   wait.until(ExpectedConditions.visibilityOf(Repository.login));
	   Repository.login.click();
	   Repository.username.sendKeys("demo");
	   Repository.password.sendKeys("1234");
	   Repository.submit.click();
	   Thread.sleep(5000);
	}

	@Given("click on banking module")
	public void click_on_banking_module() throws InterruptedException {
		Repository.banking.click();
	    Thread.sleep(7000);
	}

	@Given("click on payment to System")
	public void click_on_payment_to_system() {
	    Repository.paymentToSystem.click();
	}

	@Given("click on amount field and enter amount")
	public void click_on_amount_field_and_enter_amount() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.amount));
	    Repository.amount.sendKeys("200");
	}
	
	@When("Select the scheduling option to select scheduled")
	public void select_the_scheduling_option_to_select_scheduled() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.paynow));
		Repository.paynow.click();
		wait.until(ExpectedConditions.visibilityOf(Repository.Scheduled));
		Repository.Scheduled.click();
	}

	@When("User Enter the due date")
	public void user_enter_the_due_date() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.date));
	    Repository.date.sendKeys("30/07/2023");
	}
	
	@When("enter some description in the textbox")
	public void enter_some_description_in_the_textbox_for_the_user_needs() throws InterruptedException {
		Thread.sleep(3000);
	    Repository.description.sendKeys("Transaction is processed");
	}
	
	@When("click next button")
	public void click_next() {
	    Repository.next.click();
	}

	@When("confirm the payment")
	public void confirm_the_payment_and_click_confirm() throws InterruptedException {
		Thread.sleep(3000);
	    Repository.confirm.click();
	}

	@Then("Check if the transaction is successfully executed or not")
	public void check_if_the_transaction_is_successful_or_not() throws InterruptedException {
		Thread.sleep(3000);
	    boolean displayed = Repository.transactionFailure.isDisplayed();
	    if (displayed) {
			System.out.println("Transaction status : "+Repository.transactionFailure.getText());
		}else {
			String text = Repository.transactionSuccess.getText();
			System.out.println(text);
		}
	}
	
	@When("Select the scheduling option to select monthly installment")
	public void select_the_scheduling_option_to_select_monthly_installment() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Repository.paynow));
		Repository.paynow.click();
		wait.until(ExpectedConditions.visibilityOf(Repository.monthlyInstallment));
		Repository.monthlyInstallment.click();
	}

	@When("Enter the Number of installements")
	public void enter_the_number_of_installements() {
	    Repository.noOfInstallments.sendKeys("2");
	}

	@When("click the installment option now")
	public void click_the_installment_option_now() {
	    Repository.nowOnInstallmentOption.click();
	}
}