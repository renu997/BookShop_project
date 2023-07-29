package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {".//Features/file1.feature"},
		glue="stepDefinitions",
		plugin= {"pretty","html:reports/myreport.html"},
		dryRun=false, 
		monochrome=true,
		tags="@sanity"
	          )


public class testRunner1 {

}
