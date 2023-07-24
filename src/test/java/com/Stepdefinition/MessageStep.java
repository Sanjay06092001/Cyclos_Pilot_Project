//package com.Stepdefinition;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//public class MessageStep {
//
//public static WebDriver driver;
//
//@Before
//public void congif() {
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://demo.cyclos.org/ui/login");
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
//	PageFactory.initElements(driver,Messageclass.class);
//	driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("demo");
//    driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("1234");}
//@Given("I am on the messaging page")
//public void i_am_on_the_messaging_page()  {
////	Messageclass.product.click();
////	Messageclass.visit.click();
////	Thread.sleep(3000);
////	Messageclass.login.click();
////	Messageclass.username.sendKeys("demo");
////	Messageclass.password.sendKeys("1234");
////	driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("demo");
////    driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("1234");
//    driver.findElement(By.cssSelector("button[class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")).click();
//    
//}
//
//@When("I click on the {string} button")
//public void i_click_on_the_button(String string) throws InterruptedException {
//	Thread.sleep(3000);
//	Messageclass.msg.click();
//	Thread.sleep(3000);
//	Messageclass.newMessage.click();
//}
//
//@When("select a user from the contact list")
//public void select_a_user_from_the_contact_list() {
//	
//	Messageclass.sendto.click();
//	Messageclass.user.click();
//
//}
//
//@When("we have enter the subject {string}")
//public void we_have_enter_the_subject(String string) throws InterruptedException {
//	Thread.sleep(3000);
//  Messageclass.contact.click();
//  Messageclass.element.click();
//}
//
//@When("select the font {string} for the message")
//public void select_the_font_for_the_message(String string) throws InterruptedException {
////	Messageclass.toUser.sendKeys("Active Walking");
//	Thread.sleep(2000);
//    Messageclass.subject.sendKeys("Regarding Mail");   
//}
//
//@When("Apply italics style to the message")
//public void apply_italics_style_to_the_message() {
//    Messageclass.style.click();
//}
//
//@When("I enter the following rich text message content:")
//public void i_enter_the_following_rich_text_message_content(String docString) {
//    Messageclass.content.sendKeys("RichText");;
//}
//
//@When("click the {string} button")
//public void click_the_button(String string) {
//    Messageclass.send.click();
//}
//
//@Then("the message should be sent successfully")
//public void the_message_should_be_sent_successfully() {
//    System.out.println("Rich Text");
//}
//
//}
