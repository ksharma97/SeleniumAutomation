package MiniProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	static File file = new File("First.xlsx");
	static String src = file.getAbsolutePath();
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public static String getCourse() throws IOException {
		FileInputStream input = new FileInputStream(src);
		wb = new XSSFWorkbook(input);
		sh = wb.getSheetAt(0);
		String course = sh.getRow(1).getCell(0).getStringCellValue();
		return course;
	}
	public static String getCity() throws IOException {
		FileInputStream input = new FileInputStream(src);
		wb = new XSSFWorkbook(input);
		sh = wb.getSheetAt(0);
		String course = sh.getRow(1).getCell(1).getStringCellValue();
		return course;
	}
	
}
