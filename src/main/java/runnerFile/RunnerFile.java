package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
		features = {
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\2_Account_Information\\2_1_AccountInformation.feature",
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\3_Payment",
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\4_Messaging",
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\5_Alerts_Logging\\AlertInMarketPlace.feature",
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project_6\\src\\test\\resources\\FeatureFiles\\Adfeature.feature",
		"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\7_GiftVouchers", }, 
		glue = {
				"StepDefinition_SecondModule", 
				"StepDefinition_ThirdModule",
				"StepDefinition_FourthModule",
				"StepDefinition_FifthModule",
				"StepDefinition_SixthModule",
				"StepDefinition_SeventhModule" }, 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",
						"html:target/cucumber-reports/cucumberreport.html" }, dryRun = true, monochrome = true)

public class RunnerFile extends AbstractTestNGCucumberTests {

}