package com.Stepdefinition;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
public  class Messageclass{
	@FindBy(xpath="//a[text()='Products']")//clicking product
	public static WebElement product;
	@FindBy(xpath="//a[text()='Visit Online Demo']")//visit
	public static WebElement visit;
	@FindBy(id="login-link")//clicking login
	public static WebElement login;
	
	@FindBy (xpath="//input[@placeholder=\"User\"]")//enter username
	public static WebElement username;
	@FindBy (xpath="//*[@type=\"password\"]")//enter password
	public static WebElement password;
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
	
	//4.1
	
	//send rich text message to user
	@FindBy(xpath="//div[text()='New message']")//clicking new Message
	public static WebElement newMessage;
	
	@FindBy(xpath="//button[@class=\"form-control text-left custom-select w-100\"]")//clicking send to and select user
	public static WebElement sendto;
	
	@FindBy(xpath="//a[text()=' User ']")//select user
	public static WebElement user;
	
	
	
	@FindBy(xpath="//button[@class='btn btn-icon ml-2']")//clicking To contact list
	public static WebElement contact;
	@FindBy(xpath="//a[text()=' Active Walking ']")//clicking element
	public static WebElement element;
	 
	@FindBy(xpath="//input[@id=\"id_156\"]")//clicking subject
	public static WebElement subject;
	@FindBy(xpath="//SELECT[@id=\"id_154_fontname\"]")//clicking font
	public static WebElement font;
	@FindBy(xpath="//button[@id=\"id_154_italic\"]")//clicking style
	public static WebElement style;
	@FindBy(css="div[id=\"id_154_editor\"]")//content
	public static WebElement content;
	@FindBy(css="//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]")//send
	public static WebElement send;
	
	
}
