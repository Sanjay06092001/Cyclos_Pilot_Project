package StepDefinition_ThirdModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentToUser {
	public static WebDriver driver;
	@Given("User should launch the cyclos website and login with the valid credentials")
	public void user_should_launch_the_cyclos_website_and_login_with_the_valid_credentials() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cyclos.org");
	   WebDriverWait wait = new WebDriverWait(driver,60);
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
	   FileInputStream excelFile = new FileInputStream("C:\\Users\\sraja\\eclipse-workspace\\Spartans_Pilot_Project\\src\\main\\resources\\ExcelFile\\LoginCredentials.xlsx");
       XSSFWorkbook book = new XSSFWorkbook(excelFile);
       XSSFSheet sheet = book.getSheetAt(0);
       String userName=sheet.getRow(1).getCell(0)+"";
       String password=sheet.getRow(1).getCell(1)+"";
       int index=password.indexOf('.');
       password=password.substring(0,index);
	   Repository.username.sendKeys(userName);
	   Repository.password.sendKeys(password);
	   Repository.submit.click();
//	   Thread.sleep(3000);
	   wait.until(ExpectedConditions.visibilityOf(Repository.banking));
	}
	@Given("click on banking")
	public void click_on_banking() throws InterruptedException {
	    Repository.banking.click();
	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(Repository.paymentToUser));
	   
	    
	}

	@Given("click on payment user")
	public void click_on_payment_user() throws InterruptedException {
	    Repository.paymentToUser.click();
	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(Repository.contactbook));
	    
	}

	@When("User select the list of user and click the which user want to sent")
	public void user_select_the_list_of_user_and_click_the_which_user_want_to_sent() throws InterruptedException {
	    Repository.contactbook.click();
	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(Repository.selectGoldenTravels));
		Repository.selectGoldenTravels.click();
	    
	}

	@When("click on amount field and enter amount to transfer")
	public void click_on_amount_field_and_enter_amount_to_transfer() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(Repository.amount));
		Repository.amount.sendKeys("500");
	}

	@When("enter some description in the textbox for the user needs")
	public void enter_some_description_in_the_textbox_for_the_user_needs() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOf(Repository.description));
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
		
		//Assert.assertEquals(Repository.transactionFailure.getText(),"You have exceeded the maximum of payments per day for the demo network" );
	    ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
	}
	
}
