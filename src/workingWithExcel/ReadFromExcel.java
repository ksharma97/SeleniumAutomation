package workingWithExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcel {
	public static void main(String args[]) throws IOException {
		File file = new File("First.xlsx");
		String abs = file.getAbsolutePath();
		
		System.out.println("Absolute Path is : " +abs);
		System.out.println("Relative Path is : " +file.getCanonicalPath());
		try {
		FileInputStream input = new FileInputStream(abs);
		XSSFWorkbook wb1 = new XSSFWorkbook(input);
		XSSFSheet sheet=wb1.getSheetAt(0);
		System.out.print(sheet.getRow(0).getCell(0)+"      ");
		System.out.print(sheet.getRow(0).getCell(1)+"      ");
		System.out.print(sheet.getRow(0).getCell(2)+"      ");
		System.out.print(sheet.getRow(0).getCell(3)+"      ");
		System.out.print(sheet.getRow(0).getCell(4)+"      ");
		System.out.println();
		System.out.print(sheet.getRow(1).getCell(0)+"      ");
		System.out.print(sheet.getRow(1).getCell(1)+"      ");
		System.out.print(sheet.getRow(1).getCell(2)+"      ");
		System.out.print(sheet.getRow(1).getCell(3)+"      ");
		System.out.print(sheet.getRow(1).getCell(4)+"      ");
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
//		XSSFRow row;
//		row.getCell(0).getStringCellValue();
//		for(int i=0;i<sheet.getLastRowNum();i++)
//		{
//			row=sheet.getRow(0);
//			for(int j=0;j<row.getLastCellNum();j++)
//			{
//		System.out.print(sheet.getRow(0).getCell(0)+"      ");
//			}
//			System.out.println();
//		}
		
	}
}
