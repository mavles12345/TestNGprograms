package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProTC1 {
	
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
	
	@Test(dataProvider="sampleData")
	private void data(String email, String pass) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("login")).click();


	}
	
	@DataProvider(name="sampleData")
	private Object[][] dataSample() {
	return new Object[][] {
		
		{"jack", "12345"},
		{"viji","12345"},
		{"Thishi","12345"},
		{"Henik","12345"}
		
		
		
	};

	}
	
	}
	


