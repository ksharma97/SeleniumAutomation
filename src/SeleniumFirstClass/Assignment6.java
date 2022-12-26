package SeleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanshu\\eclipse-workspace\\SeleniumJavaAutomation\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		driver.findElement(By.name("01___title")).sendKeys("Mr.");
		driver.findElement(By.name("02frstname")).sendKeys("Kundan");
		driver.findElement(By.name("03middle_i")).sendKeys("Kumar");
		driver.findElement(By.name("04lastname")).sendKeys("Sharma");
		driver.findElement(By.name("04fullname")).sendKeys("Kundan Kumar Sharma");
		driver.findElement(By.name("05_company")).sendKeys("Cognizant");
		driver.findElement(By.name("06position")).sendKeys("Programee Trainee");
		driver.findElement(By.name("10address1")).sendKeys("Kalapahara");
		driver.findElement(By.name("11address2")).sendKeys("Bimlanagar");
		driver.findElement(By.name("13adr_city")).sendKeys("Guwahati");
		driver.findElement(By.name("14adrstate")).sendKeys("Assam");
		driver.findElement(By.name("15_country")).sendKeys("India");
		driver.findElement(By.name("16addr_zip")).sendKeys("781016");
		driver.findElement(By.name("20homephon")).sendKeys("7896582365");
		driver.findElement(By.name("21workphon")).sendKeys("6900321544");
		driver.findElement(By.name("22faxphone")).sendKeys("+1 323 555 1234");
		driver.findElement(By.name("23cellphon")).sendKeys("8875242632");
		driver.findElement(By.name("25web_site")).sendKeys("kktutorial.com");
		driver.findElement(By.name("30_user_id")).sendKeys("KKS01");
		driver.findElement(By.name("31password")).sendKeys("QWERTY@123!!!");
		driver.findElement(By.name("40cc__type")).sendKeys("Master Card");
		driver.findElement(By.name("41ccnumber")).sendKeys("4111 1111 1111 1111");
		driver.findElement(By.name("43cvc")).sendKeys("123");
		driver.findElement(By.name("42ccexp_mm")).sendKeys("09");
		driver.findElement(By.name("43ccexp_yy")).sendKeys("2025");
		driver.findElement(By.name("44cc_uname")).sendKeys("Kundan Kumar Sharma");
		driver.findElement(By.name("45ccissuer")).sendKeys("HDFC Bank");
		driver.findElement(By.name("46cccstsvc")).sendKeys("+1 323 555 1234");
		driver.findElement(By.name("60pers_sex")).sendKeys("Male");
		driver.findElement(By.name("61pers_ssn")).sendKeys("123456789");
		driver.findElement(By.name("62driv_lic")).sendKeys("DL01AS786545");
		driver.findElement(By.name("66mm")).sendKeys("Nov");
		driver.findElement(By.name("67dd")).sendKeys("09");
		driver.findElement(By.name("68yy")).sendKeys("1998");
		driver.findElement(By.name("66pers_age")).sendKeys("22");
		driver.findElement(By.name("67birth_pl")).sendKeys("Guwahati");
		driver.findElement(By.name("68__income")).sendKeys("180000");
		driver.findElement(By.name("71__custom")).sendKeys("Hello");
		driver.findElement(By.name("72__commnt")).sendKeys("Hii, How are You?");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type ='reset']")).click();
		driver.close();
		
	}
}
