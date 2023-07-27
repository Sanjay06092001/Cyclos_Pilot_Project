package RunnerFile;

//import java.io.File;
//import org.junit.AfterClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@io.cucumber.testng.CucumberOptions(

features = {"C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\2_Account_Information\\2_1_AccountInformation.feature"},
glue = {"StepDefinition_SecondModule" },
//tags="@Tag5",
//plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } ,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" },
monochrome = true
)

//C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\5_Alerts_Logging\\AlertInMarketPlace.feature
//C:\\Users\\headdala\\Downloads\\Spartans_Pilot_Project\\src\\test\\resources\\FeatureFiles\\2_Account_Information\\2_1_AccountInformation.feature

public class AccountInformationRunner extends AbstractTestNGCucumberTests {

}
