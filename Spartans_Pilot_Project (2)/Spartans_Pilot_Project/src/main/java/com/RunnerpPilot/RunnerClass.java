package com.RunnerpPilot;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@io.cucumber.testng.CucumberOptions(

features = {""},

glue = {"StepDefinition_ThirdModule" },

plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\",\"pretty",

"html:target/cucumber-reports/cucumberreport.html"},

dryRun=true,

monochrome = true

)

 

public class RunnerClass extends AbstractTestNGCucumberTests {

 

}