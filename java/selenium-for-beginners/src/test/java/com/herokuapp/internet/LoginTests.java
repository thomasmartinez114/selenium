package com.herokuapp.internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {

	@Test
	public void positiveLoginTest() {
		System.out.println("Starting loginTest");

//		   Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		   sleep for 3 seconds
		sleep(3000);

//		   maximize browser window
		driver.manage().window().maximize();

//		   open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is open");

//		   enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");

//		   enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");

//		   click login button
		WebElement logInButton = driver.findElement(By.tagName("button"));
		logInButton.click();

		sleep(3000);
//		   
//		   verifications:
//			   new url
		String expectedUrl = "http://the-internet.herokuapp.com/secure";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page URL is not the same as expected.");

//			   logout button is visible
		WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		Assert.assertTrue(logOutButton.isDisplayed(), "Log Out button is not visible");

//			   successful login message
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='flash']"));
		String expectedMessage = "You logged into a secure area!";
		String actualMessage = successMessage.getText();
		// Compare the messages now
		// Assert.assertEquals fails due to the x on the window to exit the message is
		// copied over
		// Assert.assertEquals(actualMessage, expectedMessage, "Actual message is not
		// the same as expected");
		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"Actual message does not contain the expected message.\nActual Message: " + actualMessage
						+ "\nExpected Message: " + expectedMessage);

//		   Close browser
		driver.quit();

	}

	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeLoginTest(String username, String password, String expectedErrorMessage) {
		System.out.println("Starting negativeLoginTest with " + username + " and " + password);

		// Create driver
		// System.setProperty("webdriver.chrome.driver",
		// "src/main/resources/chromedriver.exe");
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
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys(username);

		// enter password
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys(password);

		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

//		sleep(3000);

		// invalid username error
		WebElement invalidMessage = driver.findElement(By.xpath("//div[@id='flash']"));
		String actualMessage = invalidMessage.getText();
		// Assertion to compare
		Assert.assertTrue(actualMessage.contains(expectedErrorMessage),
				"Actual message does not contain the expected message.\nActual Message: " + actualMessage
						+ "\nExpected Message: " + expectedErrorMessage);

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