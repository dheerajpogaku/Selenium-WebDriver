package Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriver {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "F:\\Testing\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		
		//System.setProperty("webdriver.ie.driver", "F:\\Testing\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
	ChromeDriver driver= new ChromeDriver();
	//InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("https://www.flighthub.com/");
	System.out.println(driver.getTitle());
	/*String expected_title= "Welcome: Mercury Tours";*/
	/*String actual_title=driver.getTitle();
	
	System.out.println(driver.getTitle());*/
		
	/*if(expected_title.equals(actual_title))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.print("test fail");
	}
	
	System.out.println(driver.getCurrentUrl());
	
 driver.findElement(By.linkText("SIGN-ON")).click();
driver.findElement(By.name("userName")).sendKeys("tutorial");
driver.findElement(By.name("password")).sendKeys("tutorial");
driver.findElement(By.name("login")).click();
//System.out.println(driver.getCurrentUrl());
Select s=new Select(driver.findElement(By.name("passCount")));
//s.selectByIndex(2);
s.selectByVisibleText("4");
Select s1=new Select (driver.findElement(By.name("fromPort")));
s1.selectByIndex(4);
s1.deselectByVisibleText("Paris");
//s1.selectByValue("Portland");
//System.out.print(s1.isMultiple());

List<WebElement> elements =s1.getAllSelectedOptions();

System.out.println(elements.size());

for(WebElement ele: elements) {
	System.out.println(ele.getText());
	
}


//s1.deselectAll();
	//driver.findElement(by)
	
	//driver.close();
	
	*/
	
	
	
	
	}

}
