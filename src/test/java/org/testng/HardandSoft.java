package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoft {
	
	public WebDriver driver;
	
	@BeforeClass
	private WebDriver launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	
	}
	
	@AfterClass
	private void closeBrowser() {
	driver.quit();

	}
	
	@BeforeMethod
	private void startTime() {
	Date d=new Date();
	System.out.println(d);

	}
	
	@AfterMethod
	private void endTime() {
	Date d=new Date();
	System.out.println(d);

	}
	
	@Test
	private void hard() {
		
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("facebook"), "check title of page");
	
	WebElement txtUser=driver.findElement(By.id("email"));
	txtUser.sendKeys("jack");
	String attribute = txtUser.getAttribute("value");
	Assert.assertEquals(attribute, "selvam", "check email address");
	
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.id("login")).click();
	
	}
	
	@Test
	private void soft() {
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		SoftAssert a=new SoftAssert();
		a.assertTrue(url.contains("face"), "check URL");
		
		WebElement txtUser=driver.findElement(By.id("email"));
		txtUser.sendKeys("jack");
		String attribute = txtUser.getAttribute("value");
		a.assertEquals(attribute, "selvam", "check username");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		a.assertAll();

	}
	

}
