package com.scrolltest.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegistrationPageObect {

	private WebDriver driver;

	public RegistrationPageObect(WebDriver driver) {
		this.driver = driver;
	}

	public void RegisterUser() {
		driver.findElement(By.name("firstName")).sendKeys("Pramod");
		driver.findElement(By.name("lastName")).sendKeys("Dutta");
		driver.findElement(By.name("phone")).sendKeys("981457452");
		WebElement t = driver.findElement(By.id("userName"));
		
		driver.findElement(By.id("userName")).sendKeys("a@c.com");
		Reporter.log(""+t.getAttribute("maxlength"));
		// #Drop Down
		new Select(driver.findElement(By.name("country")))
				.selectByVisibleText("ANGUILLA");
		// register
		driver.findElement(By.name("register")).click();
	}

}
