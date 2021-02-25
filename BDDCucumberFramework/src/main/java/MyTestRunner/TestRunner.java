package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\Features\\Hooks.feature", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout","json:report_json/cucumber.json","junit:report_xml/cucumber.xml"},
		dryRun = true,
		monochrome = true,
		strict = true
		//tags = {"@SmokeTest"}
		)



public class TestRunner {

}

   //OR Condition : {"@SmokeTest , @End2End"}-Execute any of the mentioned tags
   //AND Condition : {"@SmokeTest","@End2End"}-Execute all the mentioned tags