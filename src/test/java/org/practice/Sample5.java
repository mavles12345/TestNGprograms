package org.practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample5 {

	public WebDriver driver;

	@BeforeClass
	private void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@BeforeMethod
	private void start() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void end() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass
	private void comp() {
		System.out.println("completed");

	}

	@Test
	private void TC1() {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("facebook"), "check the title of page");
		driver.findElement(By.id("email")).sendKeys("selvam");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("12345");
		String attribute = txtpass.getAttribute("value");
		Assert.assertEquals(attribute, "123", "check password");

		driver.findElement(By.name("login")).click();

	}

	@Test
	private void TC2() {
		driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(url.contains("fabook"), "check fb");
		driver.findElement(By.id("email")).sendKeys("selvam");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		soft.assertAll();

	}
}
