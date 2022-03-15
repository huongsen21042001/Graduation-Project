package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
	
	WebDriver driver = null;
	
	
	//---------------------------LOGIN------------------------//
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://itgo.vercel.app/auth/login");
	}


	@Given("Verify manage login page")
	public void verify_manage_login_page() throws Throwable {
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl, "https://itgo.vercel.app/auth/login");
		
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Login | ITGO");
		Thread.sleep(2*1000);
	}
	
	@When("User enter <email> and <password>")
	public void user_enter_email_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("sen.ho22@student.passerellesnumeriques.org");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("hothiminhthuy1107vlqt");
		Thread.sleep(1000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='mui-3']")).click();
	}
	
	@When("User enter invalid <email>")
	public void user_enter_invalid_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("hothihuongsen21042001@.com");
		Thread.sleep(1000);
	}

	@When("User enter invalid <password>")
	public void user_enter_invalid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("hothiminhthuy1107");
		Thread.sleep(1000);
	}
	
	@When("User enter <email>")
	public void user_enter_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("sen.ho22@student.passerellesnumeriques.org");
		Thread.sleep(1000);
	}
	
	@When("User enter <password>")
	public void user_enter_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("hothiminhthuy1107vlqt");
		Thread.sleep(1000);
	}
	
	@When("User enter unregistered <email>")
	public void user_enter_unregistered_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("hothihuongsen21042001@gmail.com");
		Thread.sleep(1000);
	}
	
	@Then("Message is displayed")
	public void message_is_displayed() throws Throwable {
		Thread.sleep(2*1000);
		driver.quit();
	}	

	

	//---------------------------REGISTER------------------------//
	
	@Given("User is on register page")
	public void user_is_on_register_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://itgo.vercel.app/auth/register");
		
	}

	@Given("Verify manage register page")
	public void verify_manage_register_page() throws Throwable {	
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl, "https://itgo.vercel.app/auth/register");
		
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Register | ITGO");
		Thread.sleep(2*1000);
	}

	@When("User fill out <firstname>")
	public void user_fill_out_firstname() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("Hương");
		Thread.sleep(1000);
	}

	@When("User fill out <lastname>")
	public void user_fill_out_lastname() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("Sen");
		Thread.sleep(1000);
	}

	@When("User fill out <email>")
	public void user_fill_out_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-3']")).sendKeys("hothihuongsen21042001@gmail.com");
	    Thread.sleep(1000);
	}

	@When("User fill out <password>")
	public void user_fill_out_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-4']")).sendKeys("hothiminhthuy1107vlqt");
	    Thread.sleep(1000);
	}
	
	@When("User fill out invalid <email>")
	public void user_fill_out_invalid_email() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-3']")).sendKeys("hothihuongsen21042001@gmail");
	    Thread.sleep(1000);
	}
	
	@When("User fill out invalid <password>")
	public void user_fill_out_invalid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mui-4']")).sendKeys("ddd");
	    Thread.sleep(1000);
	}
	
	

	@When("User click on Register button")
	public void user_click_on_register_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Thread.sleep(1000);
	}

	@Then("Message will be displayed")
	public void message_will_be_displayed() throws InterruptedException {
		Thread.sleep(2*1000);
		driver.quit();
	}

	

}
