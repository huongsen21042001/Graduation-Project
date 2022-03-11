package Runner;



import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/Resource/features"},
		glue = {"StepDefinitions"},
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
				dryRun = false,
				monochrome = true
        )

public class GraduationProject {

}






