package Hackathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class CreateIssue
{

public static WebDriver driver; 

@BeforeClass //Code to create chromeBrowser 
public static void chromeBrowser()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\888192\\eclipse-workspace\\Main\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://pratesting.cognizant.com");
}

@Test(priority=0)
public static void LocateProject() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

Actions action = new Actions(driver);
WebElement trgt = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[3]/div[1]"));
action.moveToElement(trgt).perform();
if(driver.findElement(By.xpath("//*[@id=\"projectIcon\"]/ul/li[1]/a")).isDisplayed())
{
driver.findElement(By.xpath("//*[@id=\"projectIcon\"]/ul/li[1]/a")).click();
}
else
{
driver.findElement(By.xpath("//*[@id=\"projectIcon\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"projectIcon\"]/ul/li[1]/a")).click();
}
}

@Test(priority=1)
public static void LocateMenuIssue() throws InterruptedException
{
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
WebElement monitar = driver.findElement(By.id("LOCK_Monitor"));
Actions action = new Actions(driver);
action.moveToElement(monitar).perform();
driver.findElement(By.xpath("//*[text()='Issues']")).click();
}


@Test(priority=2)
public static void LocateIssue() throws InterruptedException
{
driver.findElement(By.id("KEY_BUTTON_Add")).click();
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
driver.switchTo().frame("contentframe");
driver.findElement(By.name("CM_Name")).sendKeys("Save Button Working");
driver.findElement(By.name("CM_Description")).sendKeys("The Save button is not working properly.");
Select s = new Select(driver.findElement(By.name("DN_IssueCategory")));
s.selectByValue("1001571");
Select t = new Select(driver.findElement(By.name("DN_IssueType")));
t.selectByValue("1001571");
Select r = new Select(driver.findElement(By.name("DN_Responsibility")));
r.selectByVisibleText("Kundan Kumarsharma");
Select severity = new Select(driver.findElement(By.name("DN_Severity1")));
severity.selectByVisibleText("Minor");
Select priority = new Select(driver.findElement(By.name("CM_Priority")));
priority.selectByVisibleText("Low");
driver.findElement(By.name("CM_DUEDATE")).sendKeys("02-MAR-2021");
Thread.sleep(2000);
driver.findElement(By.id("SaveBtn")).click();
Thread.sleep(2000);
String id = driver.findElement(By.id("CM_ItemCode")).getText();
if(id!="")
{
System.out.println("Issue Created Successfully and Issue Id is "+id);
}
else
System.out.println("Issue not created "+id);
}

@AfterClass //Code to close the driver
public static void close()
{
driver.close();
}
}
