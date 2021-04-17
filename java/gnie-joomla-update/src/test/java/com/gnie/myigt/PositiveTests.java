package com.gnie.myigt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {
		
		System.out.println("Starting login");

		// Create Edge Driver
		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open test page
		String url = "https://gnieqa.myigt.com/sites/cr/cc/administrator/index.php";
		driver.get(url);
		System.out.println("Edge browser as been open.");
		
		// sleep for 3 seconds to view action
		sleep(3000);
		
		// Log into Joomla Admin

		// Enter username
		WebElement username = driver.findElement(By.id("mod-login-username"));

		// Enter password
		WebElement password = driver.findElement(By.id("mod-login-password"));

		// Click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
				
		// Verification:
		// new url
		
		// Close Browser
		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
