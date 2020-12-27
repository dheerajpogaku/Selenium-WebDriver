package Selenium_webdriver;


import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Window_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "F:\\Testing\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	ChromeDriver driver= new ChromeDriver();
	
	//driver.navigate().to("https://www.heromotocorp.com/en-in/");
	//driver.findElement(By.linkText("About Us")).click();
	
	driver.navigate().to("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	//window handling
	driver.manage().window().maximize(); //to maximize the window   
	String windowname = driver.getWindowHandle(); //to handle the first window
	Set<String> windows=driver.getWindowHandles(); //to handle the two windows
ArrayList l1=new ArrayList(); //to store the windows into array list

for (String S:windows)
{
	System.out.println(S);
	l1.add(S);
}

System.out.println("first window name : "  + l1.get(1));//printing the names of windows
System.out.println("first window name : "  + l1.get(2));
	driver.switchTo().window(l1.get(1).toString());//converting the window to string
	driver.manage().window().maximize();
	driver.switchTo().window(l1.get(2).toString());
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());	
	
	driver.findElementById("user_login").sendKeys("opensourcecms");
	driver.findElementById("user_pass").sendKeys("opensourcecms");
	driver.findElementByName("wp-submit").click();
	driver.navigate().back();
	driver.findElementById("user_login").sendKeys("opensourcecms");
	driver.findElementById("user_pass").sendKeys("opensourcecms");
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	

	
	//driver.findElementByName("password").sendKeys("demouser");
	//driver.findElementById("login").click();
	//driver.close();
	
	
	
	//driver.findElement(By.name("login")).click();
	//driver.findElementByName("flight_origin").sendKeys("New Delhi");
	
	//driver.navigate().refresh();
	
//driver.navigate().forward();
	}

}
