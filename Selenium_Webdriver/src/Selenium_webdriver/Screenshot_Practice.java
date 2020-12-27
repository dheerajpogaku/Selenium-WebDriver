//package Selenium_webdriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Screenshot_Practice {
//
//	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
//		//System.setProperty("webdriver.firefox.marionette", "F:\\Testing\\geckodriver-v0.18.0-win64\\geckodriver.exe");
//     ChromeDriver driver= new ChromeDriver();
//	
//     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://en.wikipedia.org/wiki/India");
//	
//	driver.manage().window().maximize();
//	
//	File Srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	File Destfile=new File("C:\\Users\\Dheeraj Reddy\\Desktop\\Updated CV\\screen_shot_trail.png");
//	System.out.println("Screen shot taken sucessfully");
//	try {
//		
////FileUtils.copyFile(Srcfile,Destfile);
//
//	}
//	catch (IOException e){
//			e.printStackTrace();
//		
//	}
//
//	}
//}//
