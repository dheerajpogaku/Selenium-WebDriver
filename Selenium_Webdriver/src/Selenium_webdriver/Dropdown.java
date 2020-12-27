package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	/*driver.get("http://newtours.demoaut.com/");*/
	/*System.out.println(driver.getCurrentUrl());
	
	String expectedurl="http://newtours.demoaut.com/";
	String actualurl="http://newtours.demoaut.com/";
	
	if (actualurl.equals(expectedurl))
	{
		System.out.println("test pass");
	}
	else
	{
		System.out.println("Test fail");
	}*/
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	/*WebElement target=driver.findElement(By.name("tripType"));
	target.click();*/
	
	Select s=new Select(driver.findElement(By.name("passCount")));
	s.selectByValue("1");
	Select s1=new Select(driver.findElement(By.name("fromPort")));
    s1.selectByVisibleText("Frankfurt");
    Select s2=new Select(driver.findElement(By.name("fromMonth"))); 
   s2.selectByVisibleText("May");
   driver.navigate().refresh();
   
   
	}

	
}
