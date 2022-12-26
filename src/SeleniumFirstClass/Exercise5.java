package SeleniumFirstClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Users/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value ='Kundan'");
		jse.executeScript("document.getElementById('address').value ='Kalapahar'");
		jse.executeScript("document.getElementById('mobile').value ='9085863201'");
		jse.executeScript("document.getElementById('email').value ='Kundan@gmail.com'");
		jse.executeScript("document.getElementById('name').value ='Kundan'");
		jse.executeScript("document.getElementById('Submit').click()");
		String result =  jse.executeScript("return Var Str =document.getElementById('result').innerText");
		System.out.println(result);
	}
}
