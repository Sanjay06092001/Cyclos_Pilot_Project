package StepDefiPilot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class StepDefinitions {



@FindBy (xpath="//*[@class='form-control ng-pristine ng-valid ng-touched']")//Enter Username
public static WebElement username;
@FindBy (xpath="//*[@type=\"password\"]")//enter password
public static WebElement password;
@FindBy (xpath="//*[@id='profile-link']")//click profile
public static WebElement profile;
@FindBy (xpath="//button[@class='btn']")//click edit
public static WebElement edit1;
@FindBy (xpath="//input[@id='address_name_7762070814175388479']")//Enter Address
public static WebElement address;
@FindBy (xpath="//*[@id='email']")//Enter email

public static WebElement email;
@FindBy (xpath="//input[@id='address_city_7762070814175388479']")//Enter City

public static WebElement City;
@FindBy (xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")//click

public static WebElement Save;
@FindBy (xpath="//button[@class='btn']")//click edit
public static WebElement edit;

@FindBy (xpath="//*[contains(text(),'Add address')]")//click Add address
public static WebElement clickAddress;

@FindBy (xpath="//*[@id='address_name_11']")//Add address

public static WebElement Addaddress1;



@FindBy (xpath="//*[@id='address_zip_11']")//Add Zipcode
public static WebElement AddZipcode;

@FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[3]']")
public static WebElement Addmobilebtn;

@FindBy(css = "input#phone_name_1")
public static WebElement phnoname;

@FindBy(xpath ="(//input[@placeholder='(201) 555-0123'])[2]")
public static WebElement phnumber;

@FindBy(xpath = "(//button[@type='button'])[2]")
public static WebElement Passwordbutton;

@FindBy(xpath = "(//input[@type='password'])[1]")
public static WebElement Oldpassinput;

@FindBy(css = "input#id_9")
public static WebElement Newpassinput;

@FindBy(css = "#id_10")
public static WebElement Cnfrmpassinut;

@FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[2]")
public static WebElement submit;

@FindBy(css = "(//label[@for='id_12'])[2]")
public static WebElement Notifybutton;

@FindBy (xpath="//*[@id='profile-link']")//click profile
public static WebElement password1;

@FindBy(xpath = "(//a[@class='nav-item'])[2]")
public static WebElement Contactbutton;

@FindBy(xpath="(//button[@type='button'])[2]")
public static WebElement  AddContact;	



 

 

	}


