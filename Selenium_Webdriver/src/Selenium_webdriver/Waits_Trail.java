package Selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Trail {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "F:\\Testing\\geckodriver-v0.18.0-win64\\geckodriver.exe");
     ChromeDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     driver.findElementByClassName("djjfond");
    WebDriverWait wait = new WebDriverWait (driver,10);
     WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("give the xpath here ")));
     link.click();
     
     
	
		
		

}
}

