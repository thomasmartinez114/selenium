package com.gnie.myigt;

import java.io.IOException;

public class Looping {

	public static void main(String[] args) throws IOException {

	// TODO Auto-generated method stub

//		String[] sites = { "https://gnieqa.myigt.com/sites/us/cc/administrator/index.php",
//				"https://gnieqa.myigt.com/sites/us/dca/administrator/index.php",
//				"https://gnieqa.myigt.com/sites/us/fst/administrator/index.php",
//				"https://gnieqa.myigt.com/sites/us/rrf/administrator/index.php",
//				"https://gnieqa.myigt.com/sites/us/sd/administrator/index.php",
//				"https://gnieqa.myigt.com/sites/us/to/administrator/index.php",
//				"https://sch.gnieqa.myigt.com/schedule/administrator/index.php"
//		};
//
//		for (int instance = 0; instance < sites.length; instance++) {
//			
//			String gnieSite = sites[instance];
//
//			// Set Joomla Update Button
//			String joomlaUpdate = "document.location=" + gnieSite + "?option=com_joomlaupdate";
//			String xpath = "//button[@onClick="+joomlaUpdate ;
//
////			System.out.println(joomlaUpdate);
//			System.out.println(xpath);
//
//		}
		
		ProcessBuilder process = new ProcessBuilder("\\gnie.myigt.com\\f$\\upload_styling_post_update\\mex_style_update.ps1");
		process.start();
}
}


//@Test
//public void loginTest() {
//
//	String[] sites = { "https://gnieqa.myigt.com/sites/ca/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/cr/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/do/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/jm/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/mx/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/pl/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/tt/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/cc/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/fst/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/rrf/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/sd/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/to/administrator/index.php",
//			"https://sch.gnieqa.myigt.com/schedule/administrator/index.php",
//			"https://gnieqa.myigt.com/sites/us/dca/administrator/index.php" };
//
//	for (int instance = 0; instance < sites.length; instance++) {
//
//		// setting String variable for gnieSite
//		String gnieSite = sites[instance];
//		// System.out.println(gnieSite);
//
//		System.out.println("Starting login into " + gnieSite);
//
//		// Create Chrome Driver
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		// Maximize browser window
//		// driver.manage().window().maximize();
//
//		// Open test page
//		String url = sites[instance];
//		driver.get(url);
//		System.out.println("Browser as been open.");
//
//		// Log into Joomla Admin
//
//		// Enter username
//		WebElement username = driver.findElement(By.id("mod-login-username"));
//		username.sendKeys("GNIEadmin");
//
//		// Enter password
//		WebElement password = driver.findElement(By.id("mod-login-password"));
//		password.sendKeys("GTECH@dm1n");
//
//		// Click login button
//		WebElement loginButton = driver.findElement(By.tagName("button"));
//		loginButton.click();
//		System.out.println("SUCCESSFUL LOGIN");
//
//		// sleep
//		sleep(8000);
//
//		// Set Joomla Update Button
//		// String joomlaUpdate = "//button[@onClick=document.location=" + gnieSite +
//		// "?option=com_joomlaupdate";
//
//		// Click Joomla Update Button
//		WebElement updateButton = driver.findElement(By.xpath("//button[contains(text(), 'Update Now')]"));
//		updateButton.click();
//
//		// sleep
//		sleep(3000);
//
//		// Click to install update
//		WebElement installButton = driver.findElement(By.xpath(
//				"/html//form[@id='adminForm']//table[@class='table table-striped']//button[@class='btn btn-primary']"));
//		installButton.click();
//		System.out.println("Joomla Update Initilized!");
//
//	}

// Close Browser
// driver.quit();

//}