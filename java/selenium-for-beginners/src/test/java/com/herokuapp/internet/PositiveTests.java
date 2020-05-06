package com.herokuapp.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {
	
	public void loginTest() {
		System.out.println("Starting loginTest");
		
//		   Create driver
		   System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		
//		   sleep for 3 seconds
		   sleep(3000);
		   
//		   maxmize browser window
		   driver.manage().window().maximize();

//		   open test page
		   String url = "http://the-internet.herokuapp.com/login";
		   driver.get(url);
		   System.out.println("Page is open");
		   
//		   sleep for 2 seconds
		   sleep(2000);
		   
		
//		   enter username
		
		
		
//		   enter password
//		   click login button
//		   
//		   verifications:
//			   new url
//			   logout button is visible
//			   successful login message
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
