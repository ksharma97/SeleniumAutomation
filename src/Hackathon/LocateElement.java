package Hackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocateElement {
	
	public static WebDriver driver;
	//function to set driver
	public static void createDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//function to locate 'Health Insurance' in the header menu of 'Policybazaar' HomePage
	public static void locateInHomePage() { 
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[2]/a"));
		action.moveToElement(link).perform();
		System.out.println("Link name is "+driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/ul/li[2]/div/div/div[2]/h3/a")).getText());
		
	}
	
	//function to locate 'Health Insurance' in the footer of 'PolicyBazaar' Homepage
	public static void locateInFooter() {
		System.out.println("Link is " +driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/ul[3]/li[2]/a")).getText());
		
	}
	
	//function to locate 'Health Insurance' in the 'ALSO BUY' option in the 'PolicyBazaar' Homepage
	public static void locateInAlsoBuy() {
		System.out.println("Link is "+driver.findElement(By.xpath("/html/body/main/div[3]/section/div/a[3]")).getText());
		
	}
	//function to get the dropdown list of 'Health Insurance' in 'Health Insurance' page.
	public static void dropdownHealthInsurance() {
		driver.navigate().to("https://www.policybazaar.com/health-insurance/health-insurance-india/");
		Actions action = new Actions(driver);
		WebElement trgt = driver.findElement(By.xpath("//*[@id='navigatorType']/body/div[1]/nav/div/div[2]/div/div[2]/ul/li[3]/div/a"));
		action.moveToElement(trgt);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown-menu min']/li/a/span[contains(text(),'Health Insurance')]"));
		System.out.println("List of Health Insurance sub-menus "+elements.size());
		for(WebElement e : elements)
			System.out.println("Text is"+e.getText());
//		System.out.println(driver.findElement(By.xpath("//ul[@class='dropdown-menu min']/li/a/span[contains(text(),'Health Insurance')]")).getText());
	}
	
	public static void carInsurance() {
		System.out.println("Car insurance");
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/ul[1]/li[2]/a")).click();
	}
	
	//function to close the driver
	public static void closeBrowser() {
		driver.close();
	}
	//main function
	public static void main(String args[]) {
		createDriver("https://www.policybazaar.com/");
//		locateInHomePage();
//		locateInFooter();
//		locateInAlsoBuy();
		carInsurance();
//		dropdownHealthInsurance();
		closeBrowser();
	}
}
