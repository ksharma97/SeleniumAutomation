package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFbAccount {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_2")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("Kundan");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("Kundansharma764@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Qwerty@123");
		driver.findElement(By.name("birthday_day")).sendKeys("09");
		driver.findElement(By.name("birthday_month")).sendKeys("Nov");
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		
	}
}
