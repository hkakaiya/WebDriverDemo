package Runner;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

	@RunWith(Cucumber.class) 
	@CucumberOptions(features="src/test/resources/Features",
	glue={"StepDefn4"},
	monochrome = true,
    plugin = {"pretty","html:target/HTMLReports/HTMLreport",
    		"json:target/JSONReports/JSONreport.json",
    		"junit:target/XMLReports/XMLreport.xml"}
	                )
	
	public class TestRunner {
	}


