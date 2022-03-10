package GraduationProject.Graduation_Project;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Login {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	// Login
	
	@Test
	public void TC_01_Login_Empty_Data(){
		// Login with Empty Data
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("");
		driver.findElement(By.id("mui-3")).sendKeys("");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-14-helper-text")).getText(), "Email required");
		Assert.assertEquals(driver.findElement(By.id("mui-15-helper-text")).getText(), "Password required");
		
	
	}
	
	@Test
	public void TC_02_Login_Valid_Data(){
		// Login with Valid Data
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("Hương Sen");
		driver.findElement(By.id("mui-3")).sendKeys("sen.ho22@student.passerellesnumeriques.org");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		
	
	}
	
	@Test
	public void TC_03_Login_Empty_Email(){
		// Login with Empty Username
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("");
		driver.findElement(By.id("mui-3")).sendKeys("senhuong21042201");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-14-helper-text")).getText(), "Email required");
	
	}
	
	@Test
	public void TC_04_Login_Empty_Password(){
		// Login with Empty Email
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("Hương Sen");
		driver.findElement(By.id("mui-3")).sendKeys("");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-15-helper-text")).getText(), "Password required");
		
	}
	
	@Test
	public void TC_05_Login_Invalid_Email(){
		// Login with Invalid Email
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("Hương Sen");
		driver.findElement(By.id("mui-3")).sendKeys("senhuong@");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-14-helper-text")).getText(), "Email must be a valid email address");
	}
	
	@Test
	public void TC_06_Login_Unregistered_Email(){
		// Login with Unregistered Email
		
		driver.get("https://itgo.vercel.app/auth/login");
		driver.findElement(By.id("mui-2")).sendKeys("Hương Sen");
		driver.findElement(By.id("mui-3")).sendKeys("senhuong@gmail.com");
	  
		driver.findElement(By.xpath("//button[@id='mui-6']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-14-helper-text")).getText(), "Email does not exist");


	}
	
	@AfterClass
		public void afterClass() {
			driver.quit();
		}
}
