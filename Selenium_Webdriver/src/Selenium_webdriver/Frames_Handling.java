package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Dheeraj Reddy
 *
 */
public class Frames_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(); // creating driver object
		
		driver.get("http://demo.guru99.com/selenium/deprecated.html"); //opening browser
		driver.manage().window().maximize();
		driver.switchTo().frame(2);
		driver.findElementByLinkText("Tree").click(); //clicking on home button
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		/*WebElement ele=driver.findElement(By.name("PackageFrame"));
		driver.switchTo().frame(ele);*/
		driver.findElementByLinkText("Action").click();
		Thread.sleep(5000, 0);
		driver.quit();
		
		
		
		
	}

}
