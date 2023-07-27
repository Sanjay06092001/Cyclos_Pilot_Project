
package StepDefinition_SixthModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdStepDef {

	public static WebDriver driver;

	@Before

	public void config() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		PageFactory.initElements(driver, AdRepoClass.class);

		driver.get("https://demo.cyclos.org/ui/login");

		Thread.sleep(10);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.username));

		AdRepoClass.username.sendKeys("demo");

		AdRepoClass.password.sendKeys("1234");

		AdRepoClass.submit.click();

	}

	@Given("Click on Advertisements")

	public void click_on_advertisements() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.marketplace)).click();

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.advertisements)).click();

	}

	@Given("Click on show advertisements")

	public void click_on_show_advertisements() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.showAdvertisements)).click();

	}

	@Given("Click  on Order By drowpdown")

	public void click_on_order_by_drowpdown() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.orderBy)).click();

	}

	@Then("Select the user choice")

	public void select_the_user_choice() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.lastPablished)).click();

	}

	@Given("Click on advertisemnts")

	public void click_on_advertisemnts() throws InterruptedException {

		Thread.sleep(3000);

		AdRepoClass.marketplace.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

//        wait.until(ExpectedConditions.visibilityOf(AdRepoClass.marketplace)).click();

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.advertisements)).click();

	}

	@Given("Click on keywords search text fields")

	public void click_on_keywords_search_text_fields() throws InterruptedException {

//        WebDriverWait wait = new WebDriverWait(driver, 20);

//        PageFactory.initElements(driver, AdRepoClass.class);

//        wait.until(ExpectedConditions.visibilityOf(AdRepoClass.Keyword)).click();

//        Thread.sleep(3000);

//        AdRepoClass.Keyword.click();

		System.out.println("cumunity");

	}

	@Then("Click Enter")

	public void click_enter() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.Keyword)).sendKeys("fruits");

	}

	@Given("Launch the Application with URL")

	public void launch_the_application_with_url() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.marketplace)).click();

		// wait.until(ExpectedConditions.visibilityOf(AdRepoClass.advertisements)).click();

	}

	@Given("Click on the Advertisements in the Marketplace")

	public void click_on_the_advertisements_in_the_marketplace() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.advertisements)).click();

	}

	@Given("Click on the Community")

	public void click_on_the_community() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.community)).click();

//        Thread.sleep(3000);

//        AdRepoClass.community.click();

//        

	}

	@Then("Community related Advertisements will appear")

	public void community_related_advertisements_will_appear() {

		System.out.println("Cummunity advertisements");

	}

	@Given("Click on Community field")

	public void click_on_community_field() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.advertisements)).click();

		// wait.until(ExpectedConditions.visibilityOf(AdRepoClass.community)).click();

	}

	@Given("Click on Activity Field")

	public void click_on_activity_field() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.showAlladvertisements)).click();

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.activities)).click();

	}

	@Then("Click on which activity you want")

	public void click_on_which_activity_you_want() {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		PageFactory.initElements(driver, AdRepoClass.class);

		wait.until(ExpectedConditions.visibilityOf(AdRepoClass.actAd)).click();

		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Successfully Passed");

	}

}
