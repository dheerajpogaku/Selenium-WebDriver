package Selenium_webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pratice_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32 85 version\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.techlistic.com/");         //opens thet link
	driver.findElementByLinkText("JAVA").click();//
    driver.manage().window().maximize();  //maximizes that window 
   /* System.out.println(driver.getTitle());*/
	String actualtitle=driver.getTitle();
	String expectedtitle="Java Tutorial For Beginners - Techlistic";
	if (actualtitle.equalsIgnoreCase(expectedtitle))
		System.out.println("Title page is valid");
	else
		System.out.println("Title page is invalid");
	
	driver.findElementByLinkText("HOME").click();
	
	driver.findElementByLinkText("SELENIUM").click();
	String actualtitle1=driver.getTitle();
	String expectedtitle1=("Selenium Webdriver Tutorial - Techlistic" );
	
	if (actualtitle1.equalsIgnoreCase(expectedtitle1))
		System.out.println("Title page is valid");
	else
		System.out.println("Title page is invalid");
	
	
	driver.quit(); //It closes the entire browser 
	/*driver.close();*/ //just closes the tab of the browser
	
	
	

	/*
	driver.findElementById("email").sendKeys("dheeruin143@gmail.com");
	driver.findElementById("pass").sendKeys("Goodmorning123");
	driver.findElementByName("login").click();
*/

		

	}

}
