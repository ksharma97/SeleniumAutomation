package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserRegistration {
	//Variable declaration	
	public static WebDriver driver;
	public static String[] data;	
	//function to setUp driver
	public static void createDriver(String url) {
//		System.out.println("Driver function called");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//function to read data from ExcelFile
	public static String[] readExcelData(String fileName , String sheetName, int rowNum) throws IOException {
		File file = new File(fileName);
		String abs = file.getAbsolutePath();
		FileInputStream input = new FileInputStream(abs);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		System.out.println("**********************************************************");
		XSSFRow row =sheet.getRow(rowNum);
		data =new String[row.getLastCellNum()];
		for(int j=0;j<row.getLastCellNum();j++) {
			data[j] = row.getCell(j).toString();
		}
		return data;
	}
	
	public static void sendData() {
//		driver.findElement(By.id("name")).sendKeys(data[0]);
//		driver.findElement(By.id("address")).sendKeys(data[1]);
//		driver.findElement(By.id("mobile")).sendKeys(data[2]);
//		driver.findElement(By.id("email")).sendKeys(data[3]);
//		driver.findElement(By.id("Submit")).click();
//		System.out.println("\t\t-------Result is -------");
//		System.out.println(driver.findElement(By.id("reult")).getText());
		System.out.println("Send Data function called");
//		List<WebElement> elements = driver.findElements(By.xpath("//div[starts-with(@class,'style__StyledText-sc-7o7nez-0 gBgfCW')]"));
		List<WebElement> elements = driver.findElements(By.xpath("//p[starts-with(@class,'contact-info')]/span/a/b/span"));
		System.out.println("Number of elements " +elements.size());
		for(WebElement e :elements) {
			System.out.println(e.getText());
		}
		
	}
	
	//function to refresh the webpage
	//function to close the browser
	public static void closeBrowser() {
		driver.quit();
	}
	
	//main function 
	public static void main(String args[]) {
		createDriver("https://www.justdial.com/Mumbai/Car-Washing-Services/nct-10079017");
//		readExcelData("Book1.xlsx","Sheet1",0);
		sendData();
		closeBrowser();
	
		
	}
}
