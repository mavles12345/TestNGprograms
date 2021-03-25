package org.secondpractice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {

	public WebDriver driver;

	@BeforeClass
	private void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

	@AfterClass
	private void doneStatus() {

		System.out.println("done");

	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	private void tc03() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("selvam");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
	}

	@Test(enabled = false)
	private void tc04() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jack");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
	}

	@Test(invocationCount = 3)
	private void tc05() {

		System.out.println("3 times executed");

	}

	@Test(priority = -1)
	private void tc06() {
		System.out.println("I am first to execute due to priority");

	}

	@Test(priority=1)
	private void tc07() {
	System.out.println("I am last to execute");
}
}