package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
		features = {"C:\\Users\\sraja\\eclipse-workspace\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\3_Payment\\3.1PaymentToUser.feature",
					"C:\\Users\\sraja\\eclipse-workspace\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\3_Payment\\3.2PaymentToSystem.feature",
					"C:\\Users\\sraja\\eclipse-workspace\\Spartans_Pilot_Project1\\src\\test\\resources\\FeatureFiles\\3_Payment\\PaymentRequest.feature"
				}, 
		glue = {"StepDefinition_ThirdModule" }, 
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",
				  "html:target/cucumber-reports/cucumberreport.html"},
		dryRun=false,
		monochrome = true
		)

public class RunnerFile extends AbstractTestNGCucumberTests  {

}