package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\sraja\\eclipse-workspace\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\3_Payment\\PaymentRequest.feature",
glue={"StepDefinition_ThirdModule"}				
)

public class RunnerFile {

}
