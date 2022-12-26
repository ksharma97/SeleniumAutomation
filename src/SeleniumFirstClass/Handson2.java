package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.regex.*;

public class Handson2 {
	
	public static String getName(WebElement element) {
		return element.getAttribute("src");
	}
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webapps.tekstac.com/Shopify/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//html/body[1]/form/div[1]/img[1]"));
		System.out.println("Src attribute's value is     : " + getName(element));
		
	}
	
}
