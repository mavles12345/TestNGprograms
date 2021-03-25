package org.secondpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice3 {

	public WebDriver driver;

	@Test
	private void tc05() {

		System.out.println("4th action");

	}

	//@Parameters({ "userName", "password" })
	
	@Test(dataProvider="dataAdd")
	private void tc07(String email, String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\MavenSelect\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);

	}

	@DataProvider(name = "dataAdd")
	@Test
	private Object[][] tc08() {

		return new Object[][] {

				{ "selvam", "12345" }, { "jack", "1235" }, { "viji", "123" }

		};

	}

}
