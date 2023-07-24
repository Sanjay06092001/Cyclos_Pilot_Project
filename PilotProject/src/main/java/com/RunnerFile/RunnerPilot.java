package com.RunnerFile;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@io.cucumber.junit.CucumberOptions(

features="C:\\Users\\vupendran\\eclipse-workspace\\PilotProject\\FeatureFile.feature\\UserFunctions\\PilotFeature.feature",

glue= {"StepDefiPilot"},

monochrome=true

)
public class RunnerPilot {
	

}
