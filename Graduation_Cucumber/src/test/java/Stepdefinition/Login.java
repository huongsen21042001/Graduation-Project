package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver = null;
	
	@Given("User is on alada page")
	public void user_is_on_alada_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alada.vn/tai-khoan/dang-nhap.html");
	}

	@Given("Verify manage page")
	public void verify_manage_page() throws Throwable {
		String manageCusPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(manageCusPageUrl, "https://alada.vn/tai-khoan/dang-nhap.html");
		
		String manageCusPageTitle = driver.getTitle();
		Assert.assertEquals(manageCusPageTitle, "Cổng giáo dục trực tuyến (E-Learning) Alada.VN");
		Thread.sleep(2*1000);
	}

	@When("User enter <email> and <password>")
	public void user_enter_email_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtLoginUsername']")).sendKeys("hothihuongsen21042001@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("hothiminhthuy1107vlqt");
		Thread.sleep(1000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//form[@id='frmLogin']//button[text()='ĐĂNG NHẬP'] ")).click();
	}

	@Then("Message is displayed")
	public void message_is_displayed() {
		System.out.println("Successfully excution");
		driver.quit();
	}

//	@When("User enter invalid <email>")
//	public void user_enter_invalid_email() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='txtLoginUsername']")).sendKeys("hothihuongsen21042001@.com");
//		Thread.sleep(1000);
//	}
//
//	@When("User enter invalid <password>")
//	public void user_enter_invalid_password() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("hothiminhthuy1107");
//		Thread.sleep(1000);
//	}
//
//	@When("User enter <password>")
//	public void user_enter_password() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("hothiminhthuy1107vlqt");
//		Thread.sleep(1000);
//	}
//
//	@When("User enter <email>")
//	public void user_enter_email() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='txtLoginUsername']")).sendKeys("hothihuongsen21042001@gmail.com");
//		Thread.sleep(1000);
//	}
//
//	@When("User enter unregistered <email>")
//	public void user_enter_unregistered_email() throws Throwable {
//		driver.findElement(By.xpath("//input[@id='txtLoginUsername']")).sendKeys("huongsen21042001@gmail.com");
//		Thread.sleep(1000);
//	}
//	

}
