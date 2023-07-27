package StepDefinition_SeventhModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Repository_7 {
	@FindBy(xpath="//div[text()='Marketplace']")
	public static WebElement marketplace;
	@FindBy(xpath="//div[text()='My vouchers']")
	public static WebElement myvouchers;
	@FindBy(xpath="//th[text()='Voucher']/following-sibling::tr")
	public static WebElement voucher;
	@FindBy(xpath="//div[text()='Print']")
	public static WebElement print;
	@FindBy(xpath="//div[contains(@class,'image d-flex')]/following-sibling::div[1]")
	public static WebElement printincon;
	@FindBy(xpath="//div[text()='Buy and email']")
	public static WebElement buyandemail;
	@FindBy(xpath="//a[contains(text(),'Cinema voucher')]")
	public static WebElement cinemavoucher;
	@FindBy(xpath="//a[contains(text(),'Gift voucher')]")
	public static WebElement giftvoucher;
	@FindBy(xpath="//a[contains(text(),'Restaurant voucher')]")
	public static WebElement restaurantvoucher;
	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	public static WebElement mail;
	@FindBy(xpath="//span[text()='Next']")
	public static WebElement next;
	@FindBy(xpath="//span[text()='Confirm']")
	public static WebElement confirm;
	@FindBy(xpath="(//div[contains(@class,'d-flex flex-grow-1')])[2]")
	public static WebElement successfuldisplay;
	@FindBy(xpath="//div[text()='The current user exceeds the maximum allowed open amount of 500.00 for vouchers of this type. The current open amount is 499.60.']")
	public static WebElement failuredisplay;
}
