package org.practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample4 {

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

	//@Parameters({ "userName", "password" })
	@Test(dataProvider="dataCollection")
	private void TC1(String email,String pass) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();

		Thread.sleep(4000);
	}
	
	@DataProvider(name="dataCollection")
	public Object[][] data() {
		return new Object[][] {
			
			{"java", "java123"}, 
			{"python","python123"}, 
			{"rooby","rooby123"}

	};
	}

}
