package com.herokuapp.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NegativeTests {
	
	@Test
	public void negativeUsernameTest() {
		System.out.println("Starting negativeUsernameTest");
		
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
