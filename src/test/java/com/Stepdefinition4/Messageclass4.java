package com.Stepdefinition4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messageclass4 {
	@FindBy(xpath="//a[text()='Products']")//clicking product
	public static WebElement product;
	@FindBy(xpath="//a[text()='Visit Online Demo']")//visit
	public static WebElement visit;
	@FindBy(xpath="//a[contains(text(),'Login')]")//clicking login
	public static WebElement login;
	
	@FindBy (xpath="//input[@placeholder=\"User\"]")//enter username
	public static WebElement username;
	@FindBy (xpath="//*[@type=\"password\"]")//enter password
	public static WebElement password;
	@FindBy (xpath="//action-button[@actionkind='primary']//button[1]")//enter submit
	public static WebElement submit;
	
	@FindBy(xpath="(//a[@class='nav-item menu-item density-custom'])[2]")//clicking message
	public static WebElement msg;
	
	//inbox
	@FindBy(xpath="//*[@class=\"custom-control-label\"][1]")//clicking inbox
	public static WebElement inbox;
	@FindBy(xpath="//*[@class=\"w-100 mw-100 text-truncate pr-3\"]")//clicking from
	public static WebElement from;
	@FindBy(xpath="//*[@id=\"id_120\"]")//clicking keyword
	public static WebElement key;
	@FindBy(xpath="//input[@placeholder=\"Type to search\"]")//clicking usersearch
	public static WebElement usersearch;
	
	//sent
	@FindBy(xpath="//*[@for=\"id_3_sent\"]")//clicking sent
	public static WebElement sent;
	@FindBy(xpath="//*[@class=\"w-100 mw-100 text-truncate pr-3\"]")//clicking from
	public static WebElement fromuser;
	@FindBy(xpath="//*//*[@id=\"id_120\"]")//clicking keyword
	public static WebElement key1;
	@FindBy(xpath="//input[@placeholder=\"Type to search\"]")//clicking usersearch
	public static WebElement usersearch1;
	
	//trash
	@FindBy(xpath="//*[@for=\"id_107_trash\"]")//clicking trash
	public static WebElement trash;
	@FindBy(xpath="//*[@class=\"w-100 mw-100 text-truncate pr-3\"]")//clicking from
	public static WebElement fromadmin;
	@FindBy(xpath="//*//*[@id=\"id_120\"]")//clicking keyword
	public static WebElement key2;
	@FindBy(xpath="//input[@placeholder=\"Type to search\"]")//clicking usersearch
	public static WebElement usersearch2;	
}
