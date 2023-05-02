package com.sneakershouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {
	
	@Test
	public void loginTest() {
		
		System.out.println("Opening Chrome");
		
		// Create driver
		System.setProperty("webDriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Opening Amazon URL 1");
		
		// open the amazon page
		String url = "https://www.amazon.com/gp/browse.html?rw_useCurrentProtocol=1&node=13213776011&ref_=amb_link_A2zi3q8eTaivigbPMYdncg_2";
		driver.get(url);
		
		// sleep 3 seconds
		sleep(3000);
				
		System.out.println("Opening Amazon URL 2");
		
		// go to coupons page
		driver.get(url);
		
		// Maximize browser window
//		driver.manage().window().maximize();
		
		// Click sign in
//		WebElement signInButton = driver.findElement(By.className("action-inner"));
//		signInButton.click();
		
		// enter email
//		WebElement email = driver.findElement(By.id("ap_email"));
//		email.sendKeys("");
		
		// click continue
//		WebElement continueButton = driver.findElement(By.id("continue"));
//		continueButton.click();
		
		// enter password
//		WebElement password = driver.findElement(By.id("ap_password"));
//		password.sendKeys("A#");
		
		// Click sign in button
//		WebElement signSubmitButton = driver.findElement(By.id("signInSubmit"));
//		signSubmitButton.click();
		
		
		// close browser
		// driver.quit();

		
/////////////////////////////////////////////////////////////////////////
//               Keep clicking until notice 50%
/////////////////////////////////////////////////////////////////////////
		
		// search until find identifier for 50% coupons
		
		// Loop through x amount of times pressing the More Coupons button
		for (int click = 0; click < 600; click++) {
	
			// Sleep
			sleep(1500);
			
			System.out.println("Opening Chrome");
			
			// Click More Coupons Button
			WebElement showMoreButton = driver.findElement(By.id("a-autoid-5"));
			showMoreButton.click();
			
			System.out.println("Click: " + click);
			
		}

		
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
