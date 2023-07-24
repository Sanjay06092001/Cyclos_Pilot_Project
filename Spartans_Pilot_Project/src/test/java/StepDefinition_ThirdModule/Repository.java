package StepDefinition_ThirdModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository {
	@FindBy(xpath="//a[contains(text(),'Products')]")
	public static WebElement product;
	@FindBy(xpath="//a[contains(text(),'Visit Online Demo')]")
	public static WebElement visitOnlineDemo;
	@FindBy(xpath="//div[text()=' Login ']")
	public static WebElement login;
	@FindBy(xpath="//input[@placeholder='User']")
	public static WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement password;
	@FindBy(xpath="(//button[@type='button'])[2]")
	public static WebElement submit;
	@FindBy(xpath="//div[text()='Banking']")
	public static WebElement banking;
	@FindBy(xpath="(//div[@class='nav-item-text'])[2]")
	public static WebElement paymentToUser;
	@FindBy(xpath="//button[contains(@class,'btn btn-icon')]")
	public static WebElement contactbook ;
	@FindBy(xpath="//a[contains(text(),'Golden Travels')]")
	public static WebElement selectGoldenTravels;
	@FindBy(xpath="//input[@placeholder='0,00']")
	public static WebElement amount;
	@FindBy(xpath="//div[text()='Pay now']")
	public static WebElement paynow;
	@FindBy(xpath="//div[@class='d-flex label-value-value']//textarea[1]")
	public static WebElement description;
	@FindBy(xpath="(//button[@type='button'])[3]")
	public static WebElement next;
	@FindBy(xpath="(//button[contains(@class,'btn d-flex')])[1]")
	public static WebElement confirm;
	@FindBy(xpath="//div[text()='You have exceeded the maximum of payments per day for the demo network']")
	public static WebElement transactionFailure;
	@FindBy(xpath="//div[text()='The payment was successfully processed']")
	public static WebElement transactionSuccess;
	
	@FindBy(xpath="//div[text()='Payment to system']")
	public static WebElement paymentToSystem;
	@FindBy(xpath="//a[contains(text(),'Scheduled')]")
	public static WebElement Scheduled;
	@FindBy(xpath="//a[contains(text(),'Monthly installments')]")
	public static WebElement monthlyInstallment;
	@FindBy(xpath="//input[@type='date']")
	public static WebElement date;
	@FindBy(xpath="//input[@type='number']")
	public static WebElement noOfInstallments;
	@FindBy(xpath="//label[text()=' Now ']")
	public static WebElement nowOnInstallmentOption;
	
	@FindBy(xpath="//div[text()='Payment requests']")
	public static WebElement PaymentRequest;
	@FindBy(xpath="//div[text()='Send a new request']")
	public static WebElement newRequest;
	@FindBy(xpath="//a[contains(text(),'Recurring payments')]")
	public static WebElement recurringPayment;
	@FindBy(xpath="//label[text()=' First payment when accepting the request ']")
	public static WebElement paymentAcceptance;
	@FindBy(xpath="(//span[text()='Confirm'])[2]")
	public static WebElement reconfirm;
	@FindBy(xpath="//div[text()='The payment request was successfully sent']")
	public static WebElement successSent;

}
