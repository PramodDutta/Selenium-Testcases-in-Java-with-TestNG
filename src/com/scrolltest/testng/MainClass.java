package com.scrolltest.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainClass extends BaseClass {

	@Test
	public void testRegisterationInDemoAUT() throws InterruptedException {

		RegisterationPageObect pageOject = new RegisterationPageObect(driver);
		driver.get("http://demoaut.com/mercuryregister.php");
		pageOject.RegisterUser();

		assert driver
				.findElement(By.tagName("body"))
				.getText()
				.contains(
						"Thank you for registering. You may now sign-in using the user name and password you've just entered.");

		assert driver.findElement(By.tagName("body")).getText()
				.contains("Dear Pramod Dutta,");

	}

}
