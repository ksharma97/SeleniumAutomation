package workingWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleValue {
	
	public static WebDriver driver;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static String[] kun;
	public static File file;
	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/InvoiceUpdates/");
	}
	
	public static void readExcelData() throws IOException { 
		file = new File("Book1.xlsx");
		String abs = file.getAbsolutePath();
		FileInputStream fis = new FileInputStream(abs);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		row = sheet.getRow(1);
		driver.navigate().refresh();
		driver.findElement(By.id("")).clear();
		int lastcol = row.getLastCellNum();
		System.out.println(lastcol);
		row.createCell(8).setCellValue("passs");
		FileOutputStream fos = new FileOutputStream(abs);
		workbook.write(fos);
		System.out.println("Last col value is " + row.getCell(8).getStringCellValue());
		XSSFSheet sheet1 = workbook.createSheet("Kundan");
		XSSFRow row1 = sheet1.createRow(0);
		for(int i=0; i<5;i++)
			row1.createCell(i).setCellValue("Kundan");
		FileOutputStream fos1 = new FileOutputStream(abs);
		workbook.write(fos1);
		fos.close();
//		XSSFCell cell = row.getCell(lastcol);
//		cell.setCellValue("pass");
//		System.out.println("Last value in first column is " +cell.getStringCellValue());
		
	}
	
	public static void main(String args[]) throws IOException {
		readExcelData();
//		setDriver();
		
	}
}
