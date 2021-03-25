package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample9 {

	public WebDriver driver;

	@Parameters({ "Browser" })
	@Test
	public void tc111(String browsername) {

		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.facebook.com/");

	}
}
