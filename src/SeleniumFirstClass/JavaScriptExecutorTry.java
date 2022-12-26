package SeleniumFirstClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTry {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.facebook.com/'");
		js.executeScript("document.getElementById('u_0_2').click()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("document.getElementsByName('firstname')[0].value ='kundan'");
	
		js.executeScript("document.getElementsByName('lastname')[0].value ='Sharma'");
		String text = (String) js.executeScript("return document.getElementsByName('firstname')[0].value");  
		System.out.println(text);
			
		
	}
}
