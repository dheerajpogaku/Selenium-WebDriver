package Selenium_webdriver;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sreenshot_Pratice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='q']").sendKeys("dheerajpogaku");
		TakesScreenshot S1=((TakesScreenshot)driver);
		File Source=S1.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Dheeraj Reddy\\Desktop\\Updated CV\\screen_shot_dheerajpogaku.png");
		System.out.println("Screenshot success");
		//FileUtils.copyFile(Source,Destination);
		Thread.sleep(5000, 0);
		driver.quit();
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dheerajpogaku");
		

	}

}
