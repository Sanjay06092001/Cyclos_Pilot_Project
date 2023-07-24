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
import zmq.socket.reqrep.Rep;

public class PaymentToUser {
	public static WebDriver driver;
	
	@Given("User should launch the cyclos website and login with the valid credentials")
	
	public void user_should_launch_the_cyclos_website_and_login_with_the_valid_credentials() throws InterruptedException {
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
	   Thread.sleep(3000);
	   
	}
	@Given("click on banking")
	public void click_on_banking() throws InterruptedException {
	    Repository.banking.click();
	    Thread.sleep(3000);
	   
	    
	}

	@Given("click on payment user")
	public void click_on_payment_user() throws InterruptedException {
	    Repository.paymentToUser.click();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(Repository.contactbook));
	    
	}

	@When("User select the list of user and click the which user want to sent")
	public void user_select_the_list_of_user_and_click_the_which_user_want_to_sent() throws InterruptedException {
	    Repository.contactbook.click();
	    Thread.sleep(3000);
		Repository.selectGoldenTravels.click();
	    
	}

	@When("click on amount field and enter amount to transfer")
	public void click_on_amount_field_and_enter_amount_to_transfer() throws InterruptedException {
		Thread.sleep(3000);
		Repository.amount.sendKeys("500");
	    
	}

	@When("Select the scheduling option to select paynow option")
	public void select_the_scheduling_option_to_select_anyone_feature() {
		Repository.paynow.click();
	}

	@When("enter some description in the textbox for the user needs")
	public void enter_some_description_in_the_textbox_for_the_user_needs() throws InterruptedException {
		Thread.sleep(3000);
	    Repository.description.sendKeys("Transaction is processed");
	}

	@When("click next")
	public void click_next() {
	    Repository.next.click();
	}

	@When("confirm the payment and click confirm")
	public void confirm_the_payment_and_click_confirm() throws InterruptedException {
		Thread.sleep(3000);
	    Repository.confirm.click();
	}

	@Then("Check if the transaction is successful or not")
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

}
