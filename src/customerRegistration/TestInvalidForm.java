package customerRegistration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestInvalidForm {
	 public static WebDriver driver;
	 
	 SetFormValues SetFormValues;
	 GetFormValues GetFormValues;
//	
//	 @BeforeClass
//	 public void setup() {
//		 driver = DriverSetup.createDriver("https://webapps.tekstac.com/CustomerRegistration_4284/");
//		 SetFormValues = new SetFormValues(driver);
//		 GetFormValues = new GetFormValues(driver);
//	 }
	 
	 @Test(dataProvider="ExcelData", dataProviderClass=ReadExcelFile.class)
	 public static void testValid(String name, String phone, String dob, String gender, String address ) {
		 System.out.println(name+" "+phone+" "+dob+" "+gender+" "+address);
	 }
	
}
