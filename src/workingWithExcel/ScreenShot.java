package workingWithExcel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ScreenShot {
	
	static WebDriver driver;
	List <WebElement>insurancelist;
	WebElement health;
	int i,j,s;
	
	public ScreenShot() {}
	
	public WebDriver createCromeDriver()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.policybazaar.com/");
		return driver;
	}
	public void LocateInHomePage() throws InterruptedException
	{
		System.out.println("On Home Page:");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[2]/a")).click();
		System.out.println("The sub-menus on Home Page:");
		LocateSubmenueOnHomePage();
		System.out.println("\n Link is :"+driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[2]/div/div/div[2]/h3/a")).getText());
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/ul[3]/li[2]/a")).click();
		health=driver.findElement(By.xpath("//*[@id=\"navigatorType\"]/body/div[1]/nav/div/div[2]/div/div[2]/ul/li[3]/div/a/span"));
		System.out.println("The sub-menus on Health Insurance Page:");
		LocateSubmenueOnHealthPage();
		driver.navigate().to("https://www.policybazaar.com/");
	}
	public void LocateSubmenueOnHomePage()
	{
		insurancelist=driver.findElements(By.xpath("/html/body/div[4]/div[1]/div/ul/li[2]/div/div/div[2]/ul/li/a/span"));
		s=insurancelist.size();
		for(i=0;i<s;i++)
		{
			j=i+1;
			System.out.println(j+" : "+insurancelist.get(i).getText());
		}
	}
	public void LocateSubmenueOnHealthPage()
	{
		try
		{
			insurancelist=driver.findElements(By.xpath("//*[@id='navigatorType']/body/div[1]/nav/div/div[2]/div/div[2]/ul/li[3]/ul/li/a"));
			Actions action=new Actions(driver);
			action.moveToElement(health).perform();
			s=insurancelist.size();
			for(i=0;i<s;i++)
			{
				j=i+1;
				System.out.println(j+" : "+insurancelist.get(i).getText());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void LocateInFooter()
	{
		System.out.println("\n On Footer:");
		System.out.println("Link is :"+driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/ul[3]/li[2]/a")).getText());
	}
	public void LocateInAlsoBuy()
	{
		System.out.println("\n On Also Buy:");
		System.out.println("Link is :"+driver.findElement(By.xpath("/html/body/main/div[3]/section/div/a[3]")).getText());
	}
	public void closeBrowser()
	{
		System.out.println("close");
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException
	{
		ScreenShot policy = new ScreenShot();
		policy.createCromeDriver();
		policy.LocateInHomePage();
		policy.LocateInAlsoBuy();
		policy.LocateInFooter();
		policy.closeBrowser();
	}

	
	
	
//	public static void main(String args[]) throws IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.policybazaar.com/travel-insurance/");
////		TakesScreenshot scrShot =((TakesScreenshot)driver);
////		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
////		File DestFile=new File("C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\kun.png");
////		Files.copy(SrcFile, DestFile);
//		driver.findElement(By.id("startdate")).click();
//		Thread.sleep(2000);
//		Select s = new Select(driver.findElement(By.id("monthselect")));
//		s.selectByVisibleText("Mar");
////		List<WebElement> allDates=driver.findElements(By.xpath(""));
//		 
//		// Click on date 28 or any other date of your choice
//		driver.findElement(By.xpath("//a[text()='28']")).click();
//		 
//		
//		
////		driver.findElement(By.xpath("//*[@id=\"navigatorType\"]/body/div[7]/div[2]/div[1]/table/tbody/tr[1]/td[6]")).click();
//		driver.close();
//	}
	
	
	
}
