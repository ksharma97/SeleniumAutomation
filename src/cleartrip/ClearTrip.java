package cleartrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("FromTag")).sendKeys("Guwahati");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[@class='autoComplete']/li"));
			for(WebElement e : list) {
				System.out.println(e.getText());
				e.click();
			}
			
			driver.findElement(By.id("ToTag")).sendKeys("Delhi");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='autoComplete']/li"));
			for(WebElement e : list1) {
				System.out.println(e.getText());
				e.click();
			}
		}
}
