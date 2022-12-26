package JavaScriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath2 {
	static WebDriver driver;
	public static void  setForm(String name, String age, String address, String phone, String email) {
		String[] data = {name,age,address,phone,email};
		int i =1;
		for(String s : data) {
			System.out.println("Value of i is " +i);
			driver.findElement(By.xpath("//tr["+i+"]/td[2]/input")).sendKeys(s);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.findElement(By.xpath("//tr["+i+"]/td[2]/input")).getText());
			i=i+1;
		}
		driver.findElement(By.id("submit")).click();
	}
	
	
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://webapps.tekstac.com/CommodityDetails/");
//	
//		By countXpath = By.xpath("//input[@type='text']");
//		List<WebElement> textBox = driver.findElements(countXpath);
//		int textBoxCount = textBox.size();
//		System.out.println("Number of TextBox is  : "+textBoxCount);
//		
//		By labelXPath1 = By.xpath("//table[@id='myTable']/tbody/tr[1]/td");
//		By labelXPath2 = By.xpath("//div[@id='result']/table/tbody/tr[1]/td[1]");
//		By labelXPath3 = By.xpath("//div[@id='result']/table/tbody/tr[1]/td[3]");
//		List<WebElement> labelsrow = driver.findElements(labelXPath1);
////		List<WebElement> labelsrow1 = driver.findElements(labelXPath2);
//		List<WebElement> labelsrow2 = driver.findElements(labelXPath3);
//		labelsrow.addAll(labelsrow2);
//		labelsrow.addAll(driver.findElements(labelXPath2));
//		System.out.println(labelsrow);
//		for(WebElement e : labelsrow) {
//			System.out.println("List : "+e.getText());
//		}
//		System.out.println("Size of list is : " +labelsrow.size());
//		
//		By buttonXpath = By.xpath("//button");
//		List<WebElement> buttons = driver.findElements(buttonXpath);
//		for(WebElement k : buttons) {
//			System.out.println("Buttons are " +k.getText());
//		}
//		System.out.println("Number of buttons in page is : " +buttons.size());
		
		driver.get("https://webapps.tekstac.com/CustomerRegistration/");
		String name="Kundan",age="25", address="Chennai",phone= "7002058599",email="kund@gmail.com";
		setForm(name,age,address,phone,email);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String result = driver.findElement(By.xpath("//h2[contains(text(),'Registered Succesfully')]")).getText();
//		System.out.println("Result is : " +result);
//		driver.navigate().back();
//		driver.findElement(By.id("reset")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.close();
//		String name,cls,rollno;
//		name ="Kundan";
//		cls="9";
//		rollno="27";
//		String[] data = {name,cls,rollno};
//		for(String a: data) {
//			System.out.println("element is  " +a);
//		}
	}
}
