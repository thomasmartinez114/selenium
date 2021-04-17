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
		
		// Log into Joomla Admin

		// Enter username
		WebElement username = driver.findElement(By.id("mod-login-username"));
		username.sendKeys("");

		// Enter password
		WebElement password = driver.findElement(By.id("mod-login-password"));
		password.sendKeys("");

		// Click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		// sleep
		sleep(3000);
		
		// Click Joomla Update Button
		WebElement updateButton = driver.findElement(By.xpath("//div[@id='system-message-container']/div[1]/button[@class='btn btn-primary']"));
		updateButton.click();
		
		// sleep
		sleep(3000);
		
		// Click to install update
		WebElement installButton = driver.findElement(By.xpath("/html//form[@id='adminForm']//table[@class='table table-striped']//button[@class='btn btn-primary']"));
		installButton.click();
		
		// sleep for install
		sleep(600000);
		
		// Verification:
		// new url
		
		// Close Browser
//		driver.quit();

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
