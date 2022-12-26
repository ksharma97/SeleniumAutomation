package SeleniumFirstClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookVerification {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.name("firstname")).sendKeys("U Know me");
		driver.findElement(By.name("lastname")).sendKeys("Thugnomics");
		driver.findElement(By.name("reg_email__")).sendKeys("786542310");
		driver.findElement(By.id("password_step_input")).sendKeys("@!qwertyNotme");
		Select d = new Select(driver.findElement(By.name("birthday_day")));
		d.selectByIndex(9);
		Select m = new Select(driver.findElement(By.id("month")));
		m.selectByVisibleText("Nov");
		Select y = new Select(driver.findElement(By.id("year")));
		y.selectByValue("1998");
		driver.quit();
		
	}
}
