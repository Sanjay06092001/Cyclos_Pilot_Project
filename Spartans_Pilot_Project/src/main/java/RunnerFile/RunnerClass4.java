package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\Users\\mvijayakumar\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\4_Messaging\\Feature1.feature",
glue={"com.StepDefinition_FourthModule"},
dryRun=false,
monochrome=true
				
)
public class RunnerClass4  extends AbstractTestNGCucumberTests{

}




