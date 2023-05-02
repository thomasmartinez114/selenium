package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {

		System.out.println("Starting loginTest");

//		create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		sleep for 3 seconds
		sleep(3000);

//		maximize browser window
		driver.manage().window().maximize();

//		URL to open
		String url = "http://the-internet.herokuapp.com/login";

//		open test page
		driver.get(url);
		System.out.println("Page is open");

//		enter username

//		enter password

//		click login button

//		verifications:
//			new url
//			logout button is visible
//			successful login message

//		close browser
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
