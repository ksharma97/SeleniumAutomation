import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draggable {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://webapps.tekstac.com/OnlineShopping/fashion.html");
		driver.manage().window().maximize();
		
		
	}
}
