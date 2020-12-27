package Selenium_webdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_trails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\chromedriver_win32_new\\chromedriver.exe");
		
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
driver.manage().window().maximize();
//To fetch the first headings of the table

//System.out.println(driver.findElement(By.xpath(".//div[@id='leftcontainer']/table/thead/tr/th[1]")).getText());
//System.out.println(driver.findElement(By.xpath(".//div[@id='leftcontainer']/table/thead/tr/th[2]")).getText());

//To fetch the first company name and company names

System.out.println(driver.findElement(By.xpath(".//div[@id='leftcontainer']/table/thead/tr/td[1]")).getText());



/*List<WebElement> companies = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));

int noofrows1 = companies.size();

for (WebElement company : companies) {
System.out.println(company.getText());
}

for (int i = 1; i <= noofrows1; i++) {
System.out.println(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]"))
.getText());
}*/


//To fetch  the coloumn size from tables and  all the coloumn names

/*List <WebElement> headings = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	int total_coloumns=headings.size(); // converting to string?
	//System.out.println(total_coloumns);
 
	
	for(WebElement ele:headings)
	{
		//System.out.println(ele.getText()); //why am I not getting data if i print only ele?
	}*/
	
	//To fetch the particular row data
	
	//System.out.println(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[1]")).getText());
	//System.out.println(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[1]")).getText());
	/*List<WebElement> Rows =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[]"));
	int Rowssize =Rows.size();
	System.out.println(Rowssize);
	for(WebElement rows:Rows)
	{
		//System.out.println(	rows.getText());
	}*/
	
	//To fetch only companies(Entire First column data)
	
	/*List<WebElement> allcoloumns =driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	
	int col=allcoloumns.size();

	for(WebElement ele:allcoloumns) {
		System.out.println(ele.getText());
		
	}*/
			/*List<WebElement> ent_rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
			
			for(WebElement ele:ent_rows)
				{
				System.out.println(ele.getText());
				}*/
              

Thread.sleep(5000, 0);;
			driver.quit();

				}
			

			
	}
	
	


