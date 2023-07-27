package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = "C:\\Users\\vupendran\\eclipse-workspace\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\1_User_Functions\\PilotFeature.feature", glue = {
				"StepDefinition_FirstModule" },

		plugin = { "html:target/cucumber-reports/cucumberreport.html" },
        dryRun = true,
		monochrome = true

)

public class RunnerPilot extends AbstractTestNGCucumberTests {

}
