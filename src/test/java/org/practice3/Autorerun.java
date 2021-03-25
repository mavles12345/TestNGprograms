package org.practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Autorerun {

	WebDriver driver = null;

	@BeforeClass
	private void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();

		

	}

	/*
	 * @Parameters({ "username", "password" })
	 * 
	 * @Test private void tc1(String email, String pass) {
	 * 
	 * driver.findElement(By.id("email")).sendKeys(email);
	 * driver.findElement(By.id("pass")).sendKeys(pass);
	 * driver.findElement(By.name("login")).click();
	 * 
	 * }
	 */

	@Test(dataProvider = "datachek")
	private void tc2(String email, String pass) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();

	}

	@DataProvider(name="datachek")
	private Object[][] dataacess() {

		return new Object[][] {

				{ "jack", "12345" }, { "viji", "12345" }, { "thishi", "123345" }, { "henik", "12345" }

		};

	}

}
