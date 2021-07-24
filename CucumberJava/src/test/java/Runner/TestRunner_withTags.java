package Runner;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

	@RunWith(Cucumber.class) 
	@CucumberOptions(features="src/test/resources/FeatureWithTags",
	glue={"StepDefn"},
	tags = "@smoke or @regression"
	                )
	
	public class TestRunner_withTags {
	}


