package Selenium_webdriver;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://demo.guru99.com/V4/index.php");
WebElement link_home=driver.findElementByName("uid");
//link_home.sendKeys("home");

	Actions builder=new Actions(driver);
	builder.moveToElement(link_home)
	.click()
	.keyDown(link_home,Keys.SHIFT)
	.sendKeys(link_home,"home")
	.doubleClick()
	.keyUp(link_home,Keys.SHIFT)
	.contextClick()
	.perform();
	

	}

}
