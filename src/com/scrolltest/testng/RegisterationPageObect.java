package com.scrolltest.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPageObect {
	  
	private WebDriver driver;
	public RegisterationPageObect(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void RegisterUser()
	{
		driver.findElement(By.name("firstName")).sendKeys("Pramod");
		driver.findElement(By.name("lastName")).sendKeys("Dutta");
		driver.findElement(By.name("phone")).sendKeys("981457452");
		driver.findElement(By.id("userName")).sendKeys("a@c.com");
		
		//#Drop Down
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("ANGUILLA");
		//register
		driver.findElement(By.name("register")).click();
	}
	

}
