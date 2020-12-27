package Selenium_webdriver ;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32 85 version\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to( "http://zero.webappsecurity.com/" );
		driver.findElementById("signin_button");
		
		
		
		// TODO Auto-generated method stub

	}

}
