package com.scrolltest.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainClass extends BaseClass {

	@Test
	public void testRegisterationInDemoAUT() throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys("Pramod");
		driver.findElement(By.name("lastName")).sendKeys("Dutta");
		driver.findElement(By.name("phone")).sendKeys("981457452");
		driver.findElement(By.id("userName")).sendKeys("a@c.com");
		
		//#Drop Down
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("ANGUILLA");
		//register
		driver.findElement(By.name("register")).click();
		
		
		
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		
		assert driver.findElement(By.tagName("body")).getText().contains("Dear Pramod Dutta,");
		
		
	}

}
