package JavaScriptExecutor;

import java.awt.Point;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {
	static String parentWinHandle;
	static String childWinHandle;
	static WebDriver driver;
	public static WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webapps.tekstac.com/MultipleWindow/");
		return driver;
	}
	
	public static String getParentWindow() {
		parentWinHandle = driver.getWindowHandle();
		return parentWinHandle;
	}
	
	public static String getChildWindow() {
		driver.findElement(By.linkText("Click to calculate EMI")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		childWinHandle =  driver.getWindowHandle();
		return childWinHandle;
	}
	public static void main(String[] args) throws Exception 
	{
		createDriver();
		try {
		String kun = getParentWindow();
		String kus = getChildWindow();
		System.out.println("Parent : " +kun+" Child : " +kus);
		}
		catch(Exception e) {
			System.out.println("djsgfhj");
		}
		
	
	}
}
