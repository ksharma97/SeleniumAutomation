package customerRegistration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class ReadExcelFile {
	
	@DataProvider(name ="ExcelData")
	public static Object[][] readExcelData() throws IOException{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow  row = sheet.getRow(1);
		int colNum = row.getLastCellNum();
		int rowNum = sheet.getLastRowNum();
		Object data[][]= new String[rowNum][colNum];
		for(int i=1;i<rowNum;i++ )
		{
			row =sheet.getRow(i);
			for(int j=0;j<colNum;j++) {
			data[i-1][j]= df.formatCellValue(row.getCell(j));
			System.out.println(data[i-1][j]);
			}
		}
		return data;
	}
	
//	@Test(dataProvider="ExcelData")
//	public static void displayData(String name, String phone, String dob, String gender, String address) {
//		System.out.println("Name is "+name);
//		System.out.println("Phone Number is "+phone);
//		System.out.println("Dob is "+dob);
//		System.out.println("Gender is "+gender);
//		System.out.println("Address is "+address);
//	}
	
//	public static void main(String args[]) throws IOException {
//		Object[][] a = readExcelData("Sheet1");
//		System.out.println("Data is "+a[0][0]);
//	}
	
}
