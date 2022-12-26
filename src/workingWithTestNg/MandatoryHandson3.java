package workingWithTestNg;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(FeatureTest.class)
public class MandatoryHandson3{

    WebDriver driver;
    String driverPath = "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\geckodriver.exe";
     
    @BeforeSuite
    public void setup(){
    	System.setProperty("webdriver.gecko.driver", driverPath);
    	driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://webapps.tekstac.com/ShipmentCharge/Index");
    }
	
    @Test(dataProvider="SearchProvider")
    public void testMethodA(String origin,String destination ,String rm ,String roadm, String air) throws InterruptedException{
       System.out.println(origin +"...."+destination+"..."+rm+"..."+roadm+"..."+air);
    	Select s = new Select(driver.findElement(By.name("origin_id")));
       s.selectByVisibleText(origin);
       Select d = new Select(driver.findElement(By.name("destination_id")));
       d.selectByVisibleText(destination);
       driver.findElement(By.name("submit")).click();
       String airprice = driver.findElement(By.xpath("//html/body/table/tbody/tr[4]/td[2]")).getText();
       String railprice = driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td[2]")).getText();
       String roadprice = driver.findElement(By.xpath("//html/body/table/tbody/tr[3]/td[2]")).getText();
       //Verify if google text box is showing correct value
        try{
        	Assert.assertEquals(airprice, air);
        }
        catch(AssertionError  e){
        System.out.println("Error message kundan");}
       try {
        Assert.assertEquals(railprice, rm);}
       catch(AssertionError  e){
           System.out.println("Error message kundan");}
       try {
    	   Assert.assertEquals("", "");
        Assert.assertEquals(roadprice, roadm);}
       catch(AssertionError  e){
           System.out.println("Error message kundan");}
    }
      
    /**
     * Here DataProvider returning value on the basis of test method name
     * @param m
     * @return
     **/

    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
         return new Object[][]{ {"Mumbai","New York","18000","10000","20000"}};
    }
    
    @AfterSuite
    public void closeBrowser() {
    	driver.quit();
    	
    
    }
    
    public void shipment() {
    	TestNG obj = new TestNG();
    	obj.setTestClasses(new Class[] {MandatoryHandson3.class});
    }
    public static void main(String args[]) {
    	MandatoryHandson3 mn = new MandatoryHandson3();
    	mn.shipment();
    }
}
