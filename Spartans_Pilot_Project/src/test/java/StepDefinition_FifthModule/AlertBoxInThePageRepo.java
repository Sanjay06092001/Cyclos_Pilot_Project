package StepDefinition_FifthModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertBoxInThePageRepo {

	@FindBy (xpath="//*[@placeholder='User']")
	public static WebElement Uname;

	@FindBy (xpath="//*[@type='password']")
	public static WebElement Pwd;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement Login;
	
	@FindBy (xpath="//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")
	public static WebElement Clicksubmit;
	 
	@FindBy(id="menu_marketplace")
	public static WebElement ClickMarketPlace;
	 
	@FindBy(xpath="//div[@class='nav-item-text' and text()='Advertisements']")
	public static WebElement ClickAdvertisements;
	
	@FindBy(xpath="//a[contains(text(),'Baking')]")
	public static WebElement ClickBaking;
	
	@FindBy(xpath="//button[contains(@class,'btn d-flex')]")
	public static WebElement Showadvertisements;
	 
	@FindBy(xpath="(//div[@class='avatar-container full-size'])[2]")
	public static WebElement Clickdonuts;
	 
	@FindBy(xpath="//div[text()='Ask a question']")
	public static WebElement Askquestion;
	 
	@FindBy(xpath="//*[@id='id_11']")
	public static WebElement ClickTextArea;

	@FindBy(xpath="(//button[contains(@class,'btn d-flex')])[1]")
	public static WebElement Finalsubmit ;

	@FindBy(xpath="(//span[@class='font-weight-bold'])[1]")
	public static WebElement AlertBox ;
	
	@FindBy(xpath="(//span[text()='hello1']")
	public static WebElement checksubmittedvalue ;
}
