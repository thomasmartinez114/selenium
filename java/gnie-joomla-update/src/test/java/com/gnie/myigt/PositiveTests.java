package com.gnie.myigt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {
		
		System.out.println("Starting login");

		// Create Edge Driver
		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// sleep for 3 seconds to view action
		sleep(3000);

		// Maximize browser window
		driver.manage().window().maximize();

		// Open test page
		String url = "https://gnieqa.myigt.com/sites/cr/cc/administrator/index.php";
		driver.get(url);
		System.out.println("Edge browser as been open.");

		// Enter username

		// Enter password

		// Click login button

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
