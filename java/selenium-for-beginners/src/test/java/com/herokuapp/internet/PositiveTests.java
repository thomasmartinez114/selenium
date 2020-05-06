package com.herokuapp.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {
	
	public void loginTest() {
//		   Create driver
		   System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		
//		   open test page
		   String url = "http://the-internet.herokuapp.com/login";
		   driver.get(url);
		   
//		   sleep for 3 seconds
		   sleep();
		   
//		   maxmize browser window
		   driver.manage().window().maximize();
		
//		   enter username
		
		
		
//		   enter password
//		   click login button
//		   
//		   verifications:
//			   new url
//			   logout button is visible
//			   successful login message
	}

	private void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
