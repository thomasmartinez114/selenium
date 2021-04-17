package com.gnie.myigt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {

		String[] sites = { "https://gnieqa.myigt.com/sites/us/cc/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/dca/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/fst/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/rrf/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/sd/administrator/index.php",
				"https://gnieqa.myigt.com/sites/us/to/administrator/index.php",
				"https://sch.gnieqa.myigt.com/schedule/administrator/index.php" };

		for (int instance = 0; instance < sites.length; instance++) {

			// setting String variable for gnieSite
			String gnieSite = sites[instance];
			System.out.println(gnieSite);

			System.out.println("Starting login");

			// Create Chrome Driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// Maximize browser window
			driver.manage().window().maximize();

			// Open test page
			String url = sites[instance];
			driver.get(url);
			System.out.println("Browser as been open.");

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
			sleep(8000);

			// Set Joomla Update Button
			String joomlaUpdate = "document.location=" + gnieSite + "?option=com_joomlaupdate";

			// Click Joomla Update Button
//		WebElement updateButton = driver.findElement(By.xpath("//div[@id='system-message-container']/div[1]/button[@class='btn btn-primary']"));
			WebElement updateButton = driver.findElement(By.xpath(joomlaUpdate));
			updateButton.click();

			// sleep
			sleep(3000);

			// Click to install update
			WebElement installButton = driver.findElement(By.xpath(
					"/html//form[@id='adminForm']//table[@class='table table-striped']//button[@class='btn btn-primary']"));
			installButton.click();

		}

//		// sleep for install
//		sleep(600000);
//		
//		// Verification:
//		// new url
//		
//		// Close Browser
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
