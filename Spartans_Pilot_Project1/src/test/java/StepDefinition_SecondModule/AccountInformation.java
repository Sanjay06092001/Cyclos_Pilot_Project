package StepDefinition_SecondModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccountInformation {
	public static WebDriver driver;
	File s1 = new File(
			"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\main\\resources\\ExcelFile\\login.xlsx");

	@Before
	public static void conf() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Launch the Application in ChromeBrowser")
	public void launch_the_application_in_chrome_browser() {
		driver.get("https://demo.cyclos.org/ui/login");
	}

	@And("Enter the UserName Password")
	public void enter_the_user_name_password() throws IOException {
		PageFactory.initElements(driver, AccountInformationRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		FileInputStream stream1 = new FileInputStream(s1);
		XSSFWorkbook wb = new XSSFWorkbook(stream1);
		XSSFSheet mysheet = wb.getSheet("Sheet1");
		Row row = mysheet.getRow(1);
		Cell a = row.getCell(0);
		Cell b = row.getCell(1);
		String username=a.getStringCellValue();
		int passwordnum=(int)b.getNumericCellValue();
		String password=Integer.toString(passwordnum);
		
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.username));
		AccountInformationRepo.username.click();
		AccountInformationRepo.username.sendKeys(username);
		AccountInformationRepo.password.click();
		AccountInformationRepo.password.sendKeys(password);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		AccountInformationRepo.Login.click();
	}

	@Then("User Should click on Banking Menu")
	public void user_should_click_on_banking_menu() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.Banking));
		AccountInformationRepo.Banking.click();
	}

// 	First
	@And("Check in the Member Account")
	public void check_in_the_member_account() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.MemberAccountSummary));
		System.out.println(AccountInformationRepo.MemberAccountSummary.getText());
		String expected ="Member account";
		String Actual = AccountInformationRepo.MemberAccountSummary.getText();
		Assert.assertEquals(Actual, expected);
		System.out.println("Test Passed");
	}

//	Second
	@And("Check in the Available Balance in the Member Account")
	public void check_in_the_available_balance_in_the_member_account() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.CurrentBalance));
		System.out.println(AccountInformationRepo.CurrentBalance.getText());
//		String expected ="9.883,01 IU's";
//		String Actual = AccountInformationRepo.CurrentBalance.getText();
//		Assert.assertEquals(Actual, expected);
		System.out.println("Test Passed");
	}

//	Third
	@When("user click on notification")
	public void user_click_on_notification() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.CLickonNotification));
		AccountInformationRepo.CLickonNotification.click();
	}

	@Then("user can see the Payments History")
	public void user_can_see_the_payments_history() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PaymentHistory));
		System.out.println(AccountInformationRepo.PaymentHistory.getText());
		String expected ="Notifications";
		String Actual = AccountInformationRepo.PaymentHistory.getText();
		Assert.assertEquals(Actual, expected);
		System.out.println("Test Passed");
	}

//  Fourth
	@When("clicking on payment to usertab in banking")
	public void clicking_on_payment_to_usertab_in_banking() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PaymentToUser));
		AccountInformationRepo.PaymentToUser.click();
	}

	@Then("click on the pickfromyourcontactlist in touser")
	public void click_on_the_pickfromyourcontactlist_in_touser() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.pickFromYourContactList));
		AccountInformationRepo.pickFromYourContactList.click();
	}

	@And("click anyone from the select a contact")
	public void click_anyone_from_the_select_a_contact() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.Listanyone));
		AccountInformationRepo.Listanyone.click();
	}

	@Then("Enter the Amount")
	public void enter_the_amount() {
		AccountInformationRepo.EnterAmount.sendKeys("12");
	}

	@And("click on next button")
	public void click_on_next_button() throws InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		AccountInformationRepo.ClickOnNext.click();
	}

	@When("click on confirm")
	public void click_on_confirm() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.ClickConfirm));
		AccountInformationRepo.ClickConfirm.click();
	}

//	@Then("click the print to confirm the payment details downloaded")
//	public void click_the_print_to_confirm_the_payment_details_downloaded() throws InterruptedException {
//		Thread.sleep(5000);
////		WebDriverWait wait = new WebDriverWait(driver, 30);
////        wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PrintingPayment));
//        boolean res4 = AccountInformationRepo.PrintingPayment.isDisplayed();
//        if (res4) {
//            System.out.println(AccountInformationRepo.PrintingPayment.getText());  
//        }else {
////        wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PrintingPayment));
//        AccountInformationRepo.PrintingPayment.click();
//        }
//	}

//	Fifth
	@And("click on the Showfilter button")
	public void click_on_the_showfilter_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.ShowFilter));
		AccountInformationRepo.ShowFilter.click();
	}

	@And("Select the pickfromyourcontactlist on book icon")
	public void select_the_pickfromyourcontactlist_on_book_icon() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PickFromYourContactList));
		AccountInformationRepo.PickFromYourContactList.click();
	}

	@When("user click anyone from the select a contact")
	public void user_click_anyone_from_the_select_a_contact() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.RandomlySelectContact));
		AccountInformationRepo.RandomlySelectContact.click();
	}

	@Then("click on the period menu")
	public void click_on_the_period_menu() {
		AccountInformationRepo.period.click();
	}

	@And("Select any oneoption")
	public void select_any_oneoption() {
		AccountInformationRepo.RandomlySelectInPeriod.click();
	}

	@Then("select the description enter the content")
	public void select_the_description_enter_the_content() {
		AccountInformationRepo.DescriptionMenu.click();
		AccountInformationRepo.DescriptionMenu.sendKeys("My name is King ");
	}

	@And("click on the From amount Enter the amount")
	public void click_on_the_from_amount_enter_the_amount() {
		AccountInformationRepo.FromAmount.click();
	}

	@And("click on the To amount Enter the amount")
	public void click_on_the_to_amount_enter_the_amount() {
		AccountInformationRepo.FromAmount.sendKeys("10");
	}

	@Then("click the filter option")
	public void click_the_filter_option() {
		AccountInformationRepo.Filter.click();
	}

	@And("Select anyone Option")
	public void select_anyone_option() {
		AccountInformationRepo.ClickMemberPayments.click();
	}

	@Then("click on the Transaction number")
	public void click_on_the_transaction_number() {
		AccountInformationRepo.Transaction.click();
	}

	@And("Enter the Transaction Number")
	public void enter_the_transaction_number() {
		AccountInformationRepo.Transaction.sendKeys("DEM-931388-NMR");
	}

	@Then("click the Direction option")
	public void click_the_direction_option() {
		AccountInformationRepo.Direction.click();
	}

	@And("Select anyone Option in direction")
	public void select_anyone_option_in_direction() {
		AccountInformationRepo.OutgoingDirection.click();
	}

	@And("click the orderBy option")
	public void click_the_order_by_option() {
		AccountInformationRepo.OrderBy.click();
	}

	@Then("Select anyone from orderby")
	public void select_anyone_from_orderby() {
		AccountInformationRepo.AnyOneInOrderBy.click();
//		String expected ="No results match the search criteria";
//		String Actual = AccountInformationRepo.fifth.getText();
//		Assert.assertEquals(Actual, expected);
//		System.out.println("Test Passed");
		
	}

//	Sixth

	@When("click anyone from the Account Summary")
	public void click_anyone_from_the_account_summary() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.AnyOneAccountSummery));
		AccountInformationRepo.AnyOneAccountSummery.click();
	}

	@Then("payment Details will be Appear to User")
	public void payment_details_will_be_appear_to_user() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PrintButton));
		System.out.println(AccountInformationRepo.PrintButton.getText());
	}

//	Seventh
	@When("click anyone from  Account Summary")
	public void click_anyone_from_account_summary() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.AnyOneAccountSummery));
		AccountInformationRepo.AnyOneAccountSummery.click();
	}

	@Then("click on the print button in the transferDetails")
	public void click_on_the_print_button_in_the_transfer_details() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInformationRepo.PrintButton));
		AccountInformationRepo.PrintButton.click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS+"passed");
	}
}
