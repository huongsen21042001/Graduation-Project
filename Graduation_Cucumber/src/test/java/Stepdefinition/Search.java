package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver = null;

	@Given("User is on aladaa website")
	public void user_is_on_aladaa_website() {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alada.vn/");
	}
	
	@Given("Verify manager website")
	public void verify_manager_page() throws Throwable {
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl, "https://alada.vn/");
		
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Cổng giáo dục trực tuyến (E-Learning) Alada.VN");
		Thread.sleep(2*1000);
	}
	
	@When("User enter <author>")
	public void user_enter_author() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("Tiến sĩ Lê Thẩm Dương");
		Thread.sleep(1000);
	}

	@When("User enter <course>")
	public void user_enter_course() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("Hành trang giúp bạn làm Sếp	");
		Thread.sleep(1000);
	}
	
	@When("User click on Search button")	
	public void user_click_on_search_button() {
		driver.findElement(By.xpath("//i[@class='fa fa-search searchico']")).click();
	}

	@Then("Message will be displayed ")
	public void message_will_be_displayed() {
		System.out.println("Successfully excution");
		driver.quit();
	}
}
