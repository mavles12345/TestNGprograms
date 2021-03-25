package org.paralleltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTc4 {

	public WebDriver driver;

	@Parameters({ "Browser" })
	@Test
	public void tc10(String browserName) {

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
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
