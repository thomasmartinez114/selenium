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

public class UpdateJoomla {

	@Test
	public void updateJoomlaAndExtensions() throws IOException {

//////////////////////////////////////////////////////////////
//		Iterate through array of GNIE Links					//
//////////////////////////////////////////////////////////////

		// TODO Poland, Trinidad, Jamaica, DR and Mexico are completed
		String[] sites = { 
				
				"https://gnie.myigt.com/sites/ca/cc/administrator/index.php",
				"https://gnie.myigt.com/sites/cr/cc/administrator/index.php",
				"https://gnie.myigt.com/sites/us/fst/administrator/index.php",
				"https://gnie.myigt.com/sites/us/rrf/administrator/index.php",
				"https://gnie.myigt.com/sites/us/sd/administrator/index.php",
				"https://gnie.myigt.com/sites/us/to/administrator/index.php",
				"https://sch.gnie.myigt.com/schedule/administrator/index.php",
				"https://gnie.myigt.com/sites/us/dca/administrator/index.php"
				
				};

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
			System.out.println("Joomla Update Initilized on " + sites[instance] + " !");
			
			// Check if URL has completion in
//			WebElement successBanner = driver.findElement(By.xpath("/html//section[@id='content']//p[@class='alert alert-success']"));
			
//			String expectedUrl = gnieSite + "?option=com_joomlaupdate&view=default&layout=complete";
//			String actualUrl = driver.getCurrentUrl();
			
			// TODO Get verification of update working
			
			// Sleep 30 seconds until the urls match
//			do {
//				sleep(30000);
//				System.out.println("Waiting for update to complete");
//			}
//			while (actualUrl != expectedUrl);
			

			// Close Browser
//			driver.close();
			
			sleep(60000);

		}

//////////////////////////////////////////////////////////////
//	Initiate PS1 to Copy Over Styling for Joomla Instance	//
//////////////////////////////////////////////////////////////
		

		
//		ProcessBuilder process = new ProcessBuilder("C:\\AdminFiles\\upload_styling_post_update\\run.cmd");
//		process.start();
//		System.out.println("COPYING STYLE CODE OVER TO INSTANCES");
		

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
