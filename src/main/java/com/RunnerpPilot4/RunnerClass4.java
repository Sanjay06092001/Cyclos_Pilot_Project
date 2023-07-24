package com.RunnerpPilot4;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\mvijayakumar\\eclipse-workspace\\PilotProject\\src\\test\\resources\\FeaturePilot\\Messaging4\\feature5.feature",
glue={"com.Stepdefinition4"},
dryRun=false,
monochrome=true
				
)
public class RunnerClass4 {

}
