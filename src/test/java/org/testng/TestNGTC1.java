package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTC1 {
	
	public WebDriver driver;
		
		@BeforeClass
		
		private WebDriver launchBroswer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\workspace\\MavenProjectTestcases\\driver\\chromedriver.exe");

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
		private void tc1() {
		
           driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("selvam");
			driver.findElement(By.id("pass")).sendKeys("12345");
			driver.findElement(By.name("login"));
			

		}
		
		@Test
		private void tc2() {
			
			System.out.println("test100");

		}
		
		@Test(enabled=false)
		private void tc3() {
		System.out.println("Hi");

		}
		
		@Test(invocationCount=5)
		private void tc4() {
		System.out.println("hello");

		}


	}


