package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(

features = {"C:\\Users\\mvijayakumar\\eclipse-workspace\\Spartans_Pilot_Project_Merge\\src\\test\\resources\\Adfolder\\Adfeature.feature"},

glue = {"com.StepdefinitionAd" },

plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",

"html:target/cucumber-reports/cucumberreport.html"},

dryRun=true,

monochrome = true

)

 

public class RunnerAd extends AbstractTestNGCucumberTests {
}

