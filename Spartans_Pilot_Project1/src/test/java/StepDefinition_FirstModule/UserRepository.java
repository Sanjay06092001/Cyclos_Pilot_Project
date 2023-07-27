package StepDefinition_FirstModule;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class UserRepository {

	@FindBy(xpath = "//input[@placeholder='User']") // enter username
	public static WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") // enter password
	public static WebElement userpassword;
	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]") // click on Submit
	public static WebElement Submit;
	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile
	public static WebElement profile;
	@FindBy(xpath = "//div[text()='Edit']") // click on Edit
	public static WebElement edit;
	@FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[2]") // click on email
	public static WebElement email;
	@FindBy(xpath = "//input[@id='address_addressLine1_7762070814175342655']") // click on address Region
	public static WebElement addressRegion;
	@FindBy(xpath = "(//span[text()='City']/following::input)[1]") // click on city
	public static WebElement city;
	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save;
	@FindBy(xpath = "//span[text()='Add address']") // click on Add address
	public static WebElement Addaddress;
	@FindBy(xpath = "//input[@id='address_name_0']") // click on Add address name
	public static WebElement AddaddressName;
	@FindBy(xpath = "//*[@id='address_addressLine1_0']") // click on Add address line1
	public static WebElement Addaddressline1;
	@FindBy(xpath = "//input[@id='address_city_0']") // Add city
	public static WebElement city1;
	@FindBy(xpath = "//input[@id='address_zip_0']") // Add Zipcode
	public static WebElement Zipcode;
	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save3;
	@FindBy(xpath = "//span[text()='Add mobile phone']") // Click Add Mobile Phones
	public static WebElement addmobilephones;
	@FindBy(xpath = "(//*[@class=\"form-control w-100 ng-pristine ng-invalid ng-touched\"])") // Enter Mobile Phone name
	public static WebElement mobilephonename;
	@FindBy(xpath = "(//input[@placeholder='(201) 555-0123'])[2]") // Enter Mobile Phone number
	public static WebElement mobilephoneno;
	@FindBy(xpath = "//div[text()='Password']") // click password
	public static WebElement password1;
	@FindBy(xpath = "//span[text()='Change']") // click change button
	public static WebElement changebutton;
	@FindBy(xpath = "(//input[@type='password'])[1]") // enter old password
	public static WebElement oldpassword;
	@FindBy(xpath = "(//input[@type='password'])[2]") // enter new password
	public static WebElement newpassword;
	@FindBy(xpath = "(//input[@type='password'])[3]") // enter new pasword again for confirmation
	public static WebElement againnewpassword;
	@FindBy(xpath = "//span[text()='Submit']") // click submit button
	public static WebElement submit2;
	@FindBy(xpath = "//div[text()='Notifications']") // click notification
	public static WebElement notification;
	@FindBy(xpath = "//*[@class=\"custom-control-label\"]") // click the unread checkbox
	public static WebElement checkbox;
	@FindBy(xpath = "//div[text()='Contacts']") // click the contacts
	public static WebElement contacts;
	@FindBy(xpath = "//*[@class=\"ci ci-grid-list\"]") // Choose the list view
	public static WebElement listview;

}