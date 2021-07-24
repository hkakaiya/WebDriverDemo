package Runner;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

	@RunWith(Cucumber.class) 
	@CucumberOptions(features="src/test/resources/FeatureWithBackground/BackgroundDemo.feature",
	glue={"StepsForBackground"},
	monochrome = true,
    plugin = {"pretty","html:target/HTMLReports/HTMLreport",
    		"json:target/JSONReports/JSONreport.json",
    		"junit:target/XMLReports/XMLreport.xml"}
	                )
	
public class TestRunnerForBackground {

}
