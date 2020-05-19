package com.herokuapp.internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTests {

	@Test(priority = 1)
	public void incorrectUsernameTest() {
		System.out.println("Starting incorrectUsernameTest");

		// Create driver
		// System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		// Create driver for Firefox
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// open page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is open");

		// enter incorrect username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tmartinez");

		// enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");

		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		
		sleep(3000);
		
		// invalid username error
		WebElement invalidMessage = driver.findElement(By.xpath("//div[@id='flash']"));
		String expectedMessage = "Your username is invalid!";
		String actualMessage = invalidMessage.getText();
		// Assertion to compare
		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"Actual message does not contain the expected message.\nActual Message: " + actualMessage
				+ "\nExpected Message: " + expectedMessage);
		
		// Close browser
		driver.quit();

	}
	
		@Test(priority = 2)
		public void incorrectPasswordTest() {
			System.out.println("Starting negativeUsernameTest");

			// Create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// sleep for 3 seconds
			sleep(3000);

			// maximize browser window
			driver.manage().window().maximize();

			// open page
			String url = "http://the-internet.herokuapp.com/login";
			driver.get(url);
			System.out.println("Page is open");

			// enter incorrect username
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("tomsmith");

			// enter password
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("incorrectpassword");

			// click login button
			WebElement loginButton = driver.findElement(By.tagName("button"));
			loginButton.click();
			
			sleep(3000);
			
			// invalid username error
			WebElement invalidMessage = driver.findElement(By.xpath("//div[@id='flash']"));
			String expectedMessage = "Your password is invalid!";
			String actualMessage = invalidMessage.getText();
			// Assertion to compare
			Assert.assertTrue(actualMessage.contains(expectedMessage),
					"Actual message does not contain the expected message.\nActual Message: " + actualMessage
					+ "\nExpected Message: " + expectedMessage);
			
			// Close browser
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
