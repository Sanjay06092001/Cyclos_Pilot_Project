package StepDefinition_FifthModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class AlertBoxInThePage {
	public static WebDriver driver;
	@Before
	public static void values() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/login");
		PageFactory.initElements(driver, AlertBoxInThePageRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		File s= new File(
				"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\main\\resources\\ExcelLoginFolder\\login.xlsx");
		
		FileInputStream stream1 = new FileInputStream(s);
		XSSFWorkbook wb1 = new XSSFWorkbook(stream1);
		XSSFSheet mysheet = wb1.getSheet("Sheet1");
		Row row = mysheet.getRow(1);
		Cell a = row.getCell(0);
		Cell b = row.getCell(1);
		String username=a.getStringCellValue();
		int passwordnum=(int)b.getNumericCellValue();
		String password=Integer.toString(passwordnum);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.Uname));
		AlertBoxInThePageRepo.Uname.click();
		AlertBoxInThePageRepo.Uname.sendKeys(username);
		AlertBoxInThePageRepo.Pwd.click();
		AlertBoxInThePageRepo.Pwd.sendKeys(password);
		AlertBoxInThePageRepo.Login.click();
	}
	
	@Given("Click on the Market Place")
	public void click_on_the_market_place() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		PageFactory.initElements( driver,AlertBoxInThePageRepo.class);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.ClickMarketPlace));
		AlertBoxInThePageRepo.ClickMarketPlace.click();
	}

	@And("Click on the advertisements")
	public void click_on_the_advertisements() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.ClickAdvertisements));
		AlertBoxInThePageRepo.ClickAdvertisements.click();
	}

	@And("Click on the Baking in Food")
	public void click_on_the_baking_in_food() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.ClickBaking));
		AlertBoxInThePageRepo.ClickBaking.click();
	}

	@And("Click on Donuts page is displayed")
	public void click_on_donuts_page_is_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.Clickdonuts));
		AlertBoxInThePageRepo.Clickdonuts.click();
	}

	@Then("Click on the Ask a Question")
	public void click_on_the_ask_a_question() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.Askquestion));
		AlertBoxInThePageRepo.Askquestion.click();
	}

	@And("Alert box is displayed")
	public void alert_box_is_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.ClickTextArea));
		AlertBoxInThePageRepo.ClickTextArea.click();
	}

	@And("Enter the question in the alert box")
	public void enter_the_question_in_the_alert_box() {
		AlertBoxInThePageRepo.ClickTextArea.sendKeys("Hello");
	}

	@And("Click on the submit button")
	public void click_on_the_submit_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AlertBoxInThePageRepo.Finalsubmit));
		AlertBoxInThePageRepo.Finalsubmit.click();
		System.out.println(AlertBoxInThePageRepo.checksubmittedvalue.getText());
		System.out.println("Test Passed");
		ExtentCucumberAdapter.addTestStepLog(Status.PASS+"passed");
	}
}
