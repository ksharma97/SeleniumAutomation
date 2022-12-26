package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerRegistration {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/CustomerRegistration/");
		driver.findElement(By.name("cname")).sendKeys("Lily");
		driver.findElement(By.name("age")).sendKeys("21");
		driver.findElement(By.name("address")).sendKeys("Chennai");
//		driver.findElement(By.name("phonenumber")).sendKeys("9085863200");
		driver.findElement(By.name("email")).sendKeys("lilyangel945@gmail.com");
		driver.findElement(By.id("submit")).click();
		System.out.println("Error message \""+driver.findElement(By.id("message")).getText()+"\"");
	}
}
