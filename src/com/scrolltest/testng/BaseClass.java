package com.scrolltest.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver  = new FirefoxDriver();
		driver.get("http://demoaut.com/mercuryregister.php");
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
	
}
