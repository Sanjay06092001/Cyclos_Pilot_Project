package RunnerFile;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@io.cucumber.testng.CucumberOptions(

features = {"C:\\Users\\mvijayakumar\\eclipse-workspace\\PilotProject\\src\\test\\resources\\FeaturePilot\\Messaging\\Feature.feature"},

glue = {"com.Stepdefinition" },

plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",

"html:target/cucumber-reports/cucumberreport.html"},

dryRun=true,

monochrome = true

)

 
public class RunnerClass4  extends AbstractTestNGCucumberTests{

}
