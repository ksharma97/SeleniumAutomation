package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handson7 {
		
		public static Object jsfname,lname,uname, password, phoneno,email;
		public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Agent_Registration/");
		driver.manage().window().maximize();
		
		//Code to get the javascriptexecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jsfname = jse.executeScript("document.getElementsByName('firstname')[0].value='Kundan'");
		lname = jse.executeScript("document.getElementsByName('lastname')[0].value='Sharma'");
		uname = jse.executeScript("document.getElementsByName('username')[0].value='KundanSharma'");
		password = jse.executeScript("document.getElementsByName('password')[0].value='Kundan155'");
		phoneno = jse.executeScript("document.getElementsByName('phonenumber')[0].value='Kundan'");
		email = jse.executeScript("document.getElementsByName('email')[0].value='Kundansharma@kun.com'");
	    jse.executeScript("document.getElementById('submit').click()");
	    
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    driver.findElement(By.linkText("Click to calculate EMI")).click();
	    driver.close();
	}
}
