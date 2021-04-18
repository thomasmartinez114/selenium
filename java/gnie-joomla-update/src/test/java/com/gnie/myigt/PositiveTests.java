/*Title:		Update Joomla Extensions, Version and Copy .css to Instance
Author:			Thomas Martinez
Date:			4/17/2021
Purpose:		Automating the process of updating Joomla extensions/version*/

package com.gnie.myigt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void updateJoomlaAndExtensions() throws IOException {
		
		
//////////////////////////////////////////////////////////////
//		Iterate through array of GNIE Links					//
//////////////////////////////////////////////////////////////


		String[] sites = { "https://gnie.myigt.com/sites/mx/cc/administrator/index.php" };

		for (int instance = 0; instance < sites.length; instance++) {

			// setting String variable for gnieSite
			String gnieSite = sites[instance];

			System.out.println("Updating Extensions for: " + gnieSite);

			// Create Chrome Driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// Maximize browser window
			// driver.manage().window().maximize();
			

//////////////////////////////////////////////////////////////
//			Open URL and Sign Into Admin Portal				//
//////////////////////////////////////////////////////////////

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
			System.out.println("SUCCESSFUL LOGIN");

			// sleep
			sleep(15000);
			

//////////////////////////////////////////////////////////////
//			Update Joomla Extensions						//
//////////////////////////////////////////////////////////////

			// Click Extensions Update Button
			WebElement updateExtButton = driver.findElement(By.xpath("//button[contains(text(), 'View Updates')]"));
			updateExtButton.click();

			// sleep
			sleep(3000);

			// Click to install update
			WebElement checkAllButton = driver.findElement(By.xpath(
					"/html//div[@id='j-main-container']/table[@class='table table-striped']//input[@name='checkall-toggle']"));
			checkAllButton.click();

			// Initiate Update
			WebElement updateConfirm = driver.findElement(By.xpath("//span[@class='icon-upload']"));

			updateConfirm.click();

			System.out.println("Extensions Update Initilized!");

			sleep(60000);
			

//////////////////////////////////////////////////////////////
//				Update Joomla Version						//
//////////////////////////////////////////////////////////////

			// Go back on browser to Joomla Admin Portal
			WebElement backAdminPortal = driver.findElement(By.xpath("//span[@class='icon-joomla']"));
			backAdminPortal.click();

			sleep(4000);

			// Update the Joomla Now
			// Click Joomla Update Button
			WebElement updateJoomButton = driver.findElement(By.xpath("//button[contains(text(), 'Update Now')]"));
			updateJoomButton.click();

			// sleep
			sleep(3000);

			// Click to install update
			WebElement installButton = driver.findElement(By.xpath(
					"/html//form[@id='adminForm']//table[@class='table table-striped']//button[@class='btn btn-primary']"));
			installButton.click();
			System.out.println("Joomla Update Initilized!");

		}
		
		
//////////////////////////////////////////////////////////////
//	Initiate PS1 to Copy Over Styling for Joomla Instance	//
//////////////////////////////////////////////////////////////
		
		sleep(120000);

//		ProcessBuilder process = new ProcessBuilder("\\gnie.myigt.com/f$/upload_styling_post_update/run.cmd");
//		process.start();
//		System.out.println("COPYING STYLE CODE OVER TO INSTANCE");

		// Close Browser
		// driver.quit();
		
		
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
