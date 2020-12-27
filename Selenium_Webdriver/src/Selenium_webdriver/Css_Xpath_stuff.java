package Selenium_webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Css_Xpath_stuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.yatra.com/");
			
		Actions a =new Actions(driver);
		
		WebElement Ele=driver.findElementByClassName("dropdown-toggle");
		
		a.moveToElement(Ele).build().perform();
	}

}
