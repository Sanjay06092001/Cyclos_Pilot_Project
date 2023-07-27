package StepDefinition_SecondModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationRepo {
	@FindBy(xpath = "//input[@formcontrolname='principal']")
	public static WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement Login;

	@FindBy(id = "menu_banking")
	public static WebElement Banking;

	@FindBy(xpath = "//div[text()=' Member account ']")
	public static WebElement MemberAccountSummary;

	@FindBy(xpath = "(//div[contains(@class,'status-value col-6')])[2]")
	public static WebElement CurrentBalance;

	@FindBy(css = "#notifications-link")
	public static WebElement CLickonNotification;

	@FindBy(css = "div.title-text.flex-grow-1")
	public static WebElement PaymentHistory;

	@FindBy(xpath = "(//maybe-link[@class='mobile-result'])[1]")
	public static WebElement PrintAndExport;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public static WebElement ShowFilter;

	@FindBy(css = "button.btn.btn-icon")
	public static WebElement PickFromYourContactList;

	@FindBy(xpath = "(//div[@class='mb-2'])[3]/a")
	public static WebElement RandomlySelectContact;
	
	@FindBy(css = "button[title='Last 12 months']")
	public static WebElement period;

	@FindBy(xpath = "//a[contains(text(),'Last month')]")
	public static WebElement RandomlySelectInPeriod;
	
	@FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[1]")
	public static WebElement DescriptionMenu;

	@FindBy(xpath = "(//input[@placeholder='0,00'])[1]")
	public static WebElement FromAmount;

	@FindBy(css = "button[title='No options selected']")
	public static WebElement Filter;
	
	@FindBy(css = "input[value='7762070814178012735']")
	public static WebElement MemberPayments;
	
	@FindBy(xpath = "//label[text()=' Member payments ']")
	public static WebElement ClickMemberPayments;

	@FindBy(css = "button[title='Not applied']")
	public static WebElement Direction;

	@FindBy(xpath = "//a[contains(text(),'Outgoing')]")
	public static WebElement OutgoingDirection;
	
	@FindBy(xpath = "//*[@id='id_6']")
	public static WebElement Transaction;

	@FindBy(css = "button[title='Date (newest first)']")
	public static WebElement OrderBy;

	@FindBy(xpath = "//a[contains(text(),'Amount (highest first)')]")
	public static WebElement AnyOneInOrderBy;
	
	@FindBy(id = "id_36")
	public static WebElement ToAmount;

	@FindBy(xpath = "//table[contains(@class,'table table-hover')]")
	public static WebElement AnyOneAccountSummery;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public static WebElement PrintButton;

	@FindBy(xpath = "//div[text()='Payment to user']")
	public static WebElement PaymentToUser;

	@FindBy(xpath = "//button[contains(@class,'btn btn-icon')]")
	public static WebElement pickFromYourContactList;

	@FindBy(xpath = "//a[contains(text(),'Business One')]")
	public static WebElement Listanyone;

	@FindBy(css = "input[type='tel']")
	public static WebElement EnterAmount;

	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]")
	public static WebElement ClickOnNext;

	@FindBy(xpath = "//span[text()='Confirm']")
	public static WebElement ClickConfirm;

	@FindBy(xpath = "//*[contains(text(),'Print')]")
	public static WebElement PrintingPayment;
	
	@FindBy(xpath = "(//div[contains(@class,'page-content-body card-body')])[2]")
	public static WebElement fifth;
	
}
