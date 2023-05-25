package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="CucumberFeatures\\LoginPage.feature",
	glue={"cucumberStepDefinitions"},
	//tags= {"@tag1"},
	dryRun = false, monochrome =true
	//dryRun will check is there step definition class or not. monochrome true will create step definition class
)

public class TestRunner {

}
