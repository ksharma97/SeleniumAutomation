package workingWithExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sapna {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Handling_Reg_Expression/");
		String path = getExcelPath
		driver.findElement(By.id("userId")).sendKeys("Shamili");
		driver.findElement(By.id("track")).click();
		String column1 = driver.findElement(By.id("result")).getText();
		System.out.println(column1);
		driver.close();
	}
}
