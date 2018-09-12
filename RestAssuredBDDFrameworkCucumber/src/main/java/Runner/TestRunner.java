package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\venkata.addala\\workspace\\RestAssuredBDDFrameworkCucumber\\src\\main\\java\\features", //path of features files
		glue="stepDefinition", //path of step definition
		format={"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, 
		dryRun=false, //it will check proper mapping between feature file and step definition.
		monochrome=true, //display output in a readable format
		strict=true//it will check any step is not defined in the step definition file
		)
public class TestRunner {

}
