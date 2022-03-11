package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
WebDriver driver = null;
	
	@Given("User is on alada website")
	public void user_is_on_alada_page_website() {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alada.vn/tai-khoan/dang-ky.html");
	}
	
	@Given("Verify manage website")
	public void verify_manager_page() throws Throwable {
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl, "https://alada.vn/tai-khoan/dang-ky.html");
		
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Cổng giáo dục trực tuyến (E-Learning) Alada.VN");
		Thread.sleep(2*1000);
	}

	@When("User enter <username>")
	public void user_enter_username() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Hương");
		Thread.sleep(1000);
		
	}
	
	@When("User enter <email>")
	public void user_enter_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("hothihuongsen21042001@gmail.com");
		Thread.sleep(1000);
	}
	
	@When("User enter again <email>")
	public void user_enter_again_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("hothihuongsen21042001@gmail.com");
		Thread.sleep(1000);
	}
	
	
	@When("User enter <password>")
	public void user_enter_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("hothiminhthuy1107vlqt");
		Thread.sleep(1000);
	}
	
	
	@When("User enter again <password>")
	public void user_enter_again_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("hothiminhthuy1107vlqt");
		Thread.sleep(1000);
	}
	
	@When("User enter <phone>")
	public void user_enter_phone() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("0947475234");
		Thread.sleep(1000);
	}
	
	@When("User click on Register button")	
	public void user_click_on_register_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Message is displayed below")
	public void message_is_displayed_below() {
		System.out.println("Successfully excution");
		driver.quit();
	}
	
	@When("User enter invalid <email>")
	public void user_enter_invalid_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("hothihuongsen21042001@.com");
		Thread.sleep(1000);
	}
	
	@When("User enter again email does not match <email>")
	public void user_enter_again_email_does_not_match() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("hothihuongsen@gmail.com");
		Thread.sleep(1000);
	}
	
	@When("User enter invalid <password>")
	public void user_enter_invalid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("hot");
		Thread.sleep(1000);
	}
	
	
	
	
	
}
