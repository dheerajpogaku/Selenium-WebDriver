package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Registration_Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32 85 version\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get(" http://automationpractice.com/index.php");
		driver.findElementByLinkText("Sign in").click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("pogakureddydheeraj@gmail.com");
		driver.findElementByName("SubmitCreate").click();
		System.out.println(driver.getTitle());
		/*driver.quit();	*/	
	}

}
