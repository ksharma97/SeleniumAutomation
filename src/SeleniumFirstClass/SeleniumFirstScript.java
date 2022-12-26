package SeleniumFirstClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class SeleniumFirstScript {
	
	public static void verifyFacebookPage() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		String URL ="https://webapps.tekstac.com/Login_Servlet_3883/";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Kundan");
		driver.findElement(By.name("password")).sendKeys("123Kundan");
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
//		driver.navigate().forward();
		WebElement element = driver.findElement(By.name("username"));
		String newName = element.getText();
		System.out.println("NAme is  "+newName);
		
		System.out.println(newName.equals("John"));
		System.out.println("Navigation Successfull");
		if(newName=="Kundan")
			System.out.println("Success");
		else
			System.out.println("fail");
//		driver.close();
//		Select s = new Select(driver.findElement(By.id("city")));
//		List<WebElement> elem = s.getOptions();
//		int sz = elem.size();
//		for(int i= 0; i<sz;i++) {
//			System.out.println((i+1)+" Option is " +elem.get(i).getText());
//		}
//		driver.navigate().back();
//		WebElement forgtpswd =  driver.findElement(By.partialLinkText("Forgotten"));
//		System.out.println("Tag name is : "+forgtpswd.getTagName());
//		System.out.println("Link Complete Text is : " +forgtpswd.getText());
//		WebElement name =  driver.findElement(By.name("email"));
//		System.out.println("Tag name is : "+name.getTagName());
//		System.out.println("Placeholder is : "+name.getAttribute("placeholder"));
//		System.out.println("Input Type is : "+name.getAttribute("type"));
//		WebElement pass =  driver.findElement(By.name("pass"));
//		WebElement login =  driver.findElement(By.name("login"));
//		//send data 
//		name.sendKeys("kundan09sharma97@gmail.com");
//		pass.sendKeys("KUND@Nsh@rm@1");
//		login.click();
//		driver.close();*/
	}
	
	public static void  main(String[] args) {
		
		verifyFacebookPage();
	}
}
