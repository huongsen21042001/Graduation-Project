package GraduationProject.Graduation_Project;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Search {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {		
		System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	//Search
	
	@Test
	public void TC_01_Search_Author_Name() throws Throwable{
		driver.get("https://alada.vn/");
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("Tiến sĩ Lê Thẩm Dương");
		Thread.sleep(2*1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search searchico']")).click();
	}
	
	@Test
	public void TC_02_Search_Course_Name() throws Throwable{
		driver.get("https://alada.vn/");
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("Hành trang giúp bạn làm sếp");
		Thread.sleep(2*1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search searchico']")).click();
	}
	
	@Test
	public void TC_03_Search_Empty_Name() throws Throwable{
		driver.get("https://alada.vn/");
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("");
		Thread.sleep(2*1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search searchico']")).click();
		
//		Assert.assertEquals(driver.findElement(By.id("content")).getText(), "No result");
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
	
}

