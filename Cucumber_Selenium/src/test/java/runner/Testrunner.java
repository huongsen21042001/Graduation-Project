package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/src/test/java/features/nameTest.feature",
glue= {"/Cucumber_Selenium/src/test/java/seleniumgluecode/Test.java"}
)

public class Testrunner {
	
}






