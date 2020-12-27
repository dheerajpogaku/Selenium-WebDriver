package Selenium_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Pratice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32 85 version\\chromedriver.exe");
		
	ChromeDriver driver= new ChromeDriver();
	
	
	
	driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
	driver.switchTo().frame(2);
	driver.findElementByLinkText("Deprecated").click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElementByLinkText("Action").click();
	driver.switchTo().frame("classFrame");
	driver.findElementByLinkText("AddApplicationCache");
	
	

	}

}
