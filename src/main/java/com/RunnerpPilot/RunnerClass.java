package com.RunnerpPilot;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\mvijayakumar\\eclipse-workspace\\PilotProject\\src\\test\\resources\\FeaturePilot\\Messaging\\Feature.feature",
glue={"com.Stepdefinition"},
dryRun=false,
monochrome=true,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}					
)
public class RunnerClass {

}
