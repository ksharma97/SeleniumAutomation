package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		System.out.println("Default Value of Credit Card Type : " +new Select(driver.findElement(By.name("40cc__type"))).getFirstSelectedOption().getText());
		System.out.println("Default Value of card expiration (Month) : " +new Select(driver.findElement(By.name("42ccexp_mm"))).getFirstSelectedOption().getText());
		System.out.println("Default Value of card expiration (Year) : " +new Select(driver.findElement(By.name("43ccexp_yy"))).getFirstSelectedOption().getText());
		System.out.println("Default value of Month : " +new Select(driver.findElement(By.name("66mm"))).getFirstSelectedOption().getText());
		System.out.println("Default value of Day : " +new Select(driver.findElement(By.name("67dd"))).getFirstSelectedOption().getText());
		System.out.println("Default value of Year : " +new Select(driver.findElement(By.name("68yy"))).getFirstSelectedOption().getText());
		driver.close();
	}
	
}
