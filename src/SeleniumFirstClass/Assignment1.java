package SeleniumFirstClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class Assignment1 {
	public static WebDriver driver;
	
	//function to setup driver
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
	}
	
	//function to work with textbox
	public void textBox(){
		driver.findElement(By.xpath("//li[@id='item-0']/span[contains(text(),'Text Box')]")).click();
		driver.findElement(By.id("userName")).sendKeys("Kundan");
		driver.findElement(By.id("userEmail")).sendKeys("kundansharma@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Guwahati");
		driver.findElement(By.id("permanentAddress")).sendKeys("Begusarai");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('submit').click()");
		System.out.printf("\n**********OUTPUT********\n %s \n %s \n %s \n %s",driver.findElement(By.id("name")).getText(),driver.findElement(By.id("email")).getText(),driver.findElement(By.xpath("//p[@id='currentAddress']")).getText(),driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText());
	}
	
	//function to work with Check Box
	public void checBox() {
		driver.findElement(By.xpath("//li[@id='item-1']/span[contains(text(),'Check Box')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('tree-node-home').click()");
		System.out.printf("\n***************OUTPUT************\n %s",driver.findElement(By.id("result")).getText());
	}
	
	//function to work with radio button
	public void radioButton() {
		driver.findElement(By.xpath("//li[@id='item-2']/span[contains(text(),'Radio Button')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('yesRadio').click()");
		System.out.println("Output should be \'Yes\' : " + driver.findElement(By.xpath("//p[contains(text(),'You have')]")).getText());
		js.executeScript("document.getElementById('impressiveRadio').click()");
		System.out.println("Output should be \'Impressive\' : " + driver.findElement(By.xpath("//p[contains(text(),'You have')]")).getText());
		js.executeScript("document.getElementById('noRadio').disabled=false"); //code to enable disabled radio button
	}
	
	//function to work with web tables
	public void webTables() {
		driver.get("https://demoqa.com/webtables");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('addNewRecordButton').click()");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Kundan");
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("age")).sendKeys("45");
		driver.findElement(By.id("salary")).sendKeys("15000");
		driver.findElement(By.id("department")).sendKeys("QEA");
		driver.findElement(By.id("submit")).click();
		System.out.printf("%s",driver.findElement(By.xpath("//div[@class='rt-table']/div[@class='rt-tbody']")).getText());
	}
	
	//function to work with buttons
	public void buttons() {
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		action.click(driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[3]/button"))).build().perform();
		System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
	}
	
	//function to work with Links
	public void links() {
		driver.get("https://demoqa.com/links");
		String tab = driver.getWindowHandle();
		System.out.println("Current Tab Id is : " +tab);
		System.out.println("Page Title is : " +driver.getTitle());
		driver.findElement(By.xpath("//div[@id='linkWrapper']/p[1]/a")).click();
		
		List<String> tabs = (List<String>) driver.getWindowHandles();
		driver.findElement(By.xpath("//div[@id='linkWrapper']/p[2]/a")).click();
	
	}
	
	//function to close the browser
	public void closeBrowser() {
		driver.quit();
	}
	public static void main(String args[]) {
		Assignment1 a = new Assignment1();
		a.createDriver();
//		a.textBox();
//		a.checBox();
//		a.radioButton();
//		a.webTables();
//		a.buttons();
		a.links();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.closeBrowser();
	}
	
}
