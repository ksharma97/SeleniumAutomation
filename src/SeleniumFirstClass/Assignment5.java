package SeleniumFirstClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/FormRegistration/StudentRegistration.html");
//		Select m = new Select(driver.findElement(By.name("66mm")));
//		m.selectByIndex(11);
//		System.out.println("Selected Value is : " +m.getFirstSelectedOption().getText());
//		Select d = new Select(driver.findElement(By.name("67dd")));
//		String date = "09";
//		d.selectByVisibleText(date);
//		System.out.println("Selected Value is : " +d.getFirstSelectedOption().getText());
//		Select y = new Select(driver.findElement(By.name("68yy")));
//		y.selectByValue("1998");
//		System.out.println("Selected Value is : " +y.getFirstSelectedOption().getText());
//		WebElement cm = driver.findElement(By.name("42ccexp_mm"));
//		cm.sendKeys("09");
//		System.out.println("Selected Value is : " +new Select(driver.findElement(By.name("42ccexp_mm"))).getFirstSelectedOption().getText());
//		driver.close();
//		By customPath = By.xpath("//input[@type='submit' and @value ='Submit Form']");
//		driver.findElement(customPath).click();
//		System.out.println(driver.switchTo().alert().getText());
	}
}
