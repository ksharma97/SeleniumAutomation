package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterviewQuestion {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().fullscreen();
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("kundansharma764@gmail.com");
	driver.findElement(By.xpath("//*[@jsname='LgbsSe']")).click();
//    driver.quit();
	}
}
