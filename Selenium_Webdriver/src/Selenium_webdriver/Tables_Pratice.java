package Selenium_webdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_Pratice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		
		List <WebElement> ele = driver.findElements(By.xpath(".//table[@class='tsc_table_s13']/thead/tr"));
		
		int size=ele.size();
		System.out.println(size);
		
		
		//System.out.println(driver.findElement(By.xpath(".//table[@class='tsc_table_s13']/thead/tr/th[1]")).getText());
		
		
		
		
/*System.out.println(driver.findElement(By.xpath(".//table[@class='tsc_table_s13'] /thead/tr/th[1]")).getText());*/


	
		
		
		
		driver.quit();
	}

}
