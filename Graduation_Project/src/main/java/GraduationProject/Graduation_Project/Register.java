package GraduationProject.Graduation_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	
	//Register
	
	@Test
	public void TC_01_Register_Empty_Data(){
		
		// Register with Empty Data
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("");
		driver.findElement(By.id("mui-2")).sendKeys("");
		driver.findElement(By.id("mui-3")).sendKeys("");
		driver.findElement(By.id("mui-4")).sendKeys("");
		
		try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {

	        e.printStackTrace();
	    }
	  
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
	}
	
	@Test
	public void TC_02_Register_Valid_Data(){
		
	// Register with Empty Data
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("Sen");
		driver.findElement(By.id("mui-2")).sendKeys("Hương");
		driver.findElement(By.id("mui-3")).sendKeys("senni@gmail.com");
		driver.findElement(By.id("mui-4")).sendKeys("sen2104");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		
	}
	
	@Test
	public void TC_03_Register_FirstName_Empty(){
		
	// Register with Empty Data
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("");
		driver.findElement(By.id("mui-2")).sendKeys("Hương");
		driver.findElement(By.id("mui-3")).sendKeys("senni@gmail.com");
		driver.findElement(By.id("mui-4")).sendKeys("sen2104");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-2868-helper-text")).getText(), "First name required");
	
	}
	
	@Test
	public void TC_04_Register_LastName_Empty(){
		
	// Register with Empty Data
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("Sen");
		driver.findElement(By.id("mui-2")).sendKeys("");
		driver.findElement(By.id("mui-3")).sendKeys("senni@gmail.com");
		driver.findElement(By.id("mui-4")).sendKeys("sen2104");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-2869-helper-text")).getText(), "Last name required");
		
	}
	
	
	@Test
	public void TC_05_Register_Email_Empty(){
		
	 //Register with empty Email
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("Sen");
		driver.findElement(By.id("mui-2")).sendKeys("Hương");
		driver.findElement(By.id("mui-3")).sendKeys("");
		driver.findElement(By.id("mui-4")).sendKeys("sen2104");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-2870-helper-text")).getText(), "Email required");
		
	}
	
	
	@Test
	public void TC_06_Reisgter_Pasword_Empty(){
		
	// Register with empty Password
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("Sen");
		driver.findElement(By.id("mui-2")).sendKeys("Hương");
		driver.findElement(By.id("mui-3")).sendKeys("senni@gmail.com");
		driver.findElement(By.id("mui-4")).sendKeys("");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-2871-helper-text")).getText(), "Password required");
		//p[@id='mui-14-helper-text']
		
	}
	
	@Test
	public void TC_06_Reisgter_Invalid_Email(){
		
	// Register with invalid Email
		
		driver.get("https://itgo.vercel.app/auth/register");
		driver.findElement(By.id("mui-1")).sendKeys("Sen");
		driver.findElement(By.id("mui-2")).sendKeys("Hương");
		driver.findElement(By.id("mui-3")).sendKeys("senni");
		driver.findElement(By.id("mui-4")).sendKeys("sen2104");
		
		driver.findElement(By.xpath("//button[@id='mui-5']")).click();
		Assert.assertEquals(driver.findElement(By.id("mui-2870-helper-text")).getText(), "Email must be a valid email address");
	
		
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
}
