package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@io.cucumber.testng.CucumberOptions(

features = {"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\5_Alerts_Logging\\AlertInMarketPlace.feature"},
glue = {"StepDefinition_FifthModule" },
plugin = {"html:target/cucumber-reports/cucumberreport.html"},
monochrome = true
)
//C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\2_Account_Information\\2_1_AccountInformation.feature

public class AccountInformationRunner extends AbstractTestNGCucumberTests {

}
