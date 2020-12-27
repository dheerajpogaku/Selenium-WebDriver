package Selenium_webdriver;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		System.out.println(driver.getTitle());
		String S1=driver.getWindowHandle();
		System.out.println(S1);
		Set <String> Windows=driver.getWindowHandles();
		ArrayList L1= new ArrayList();
	for(String S:Windows)
	{
		L1.add(S);
		System.out.println(L1);
	}
	Thread.sleep(5000, 0);
	driver.quit();
		
	
	}

}
