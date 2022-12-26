package customerRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetFormValues {
		public WebDriver driver;
		public SetFormValues() {}
		
		public SetFormValues(WebDriver driver) {
			this.driver =driver;
		}
		
		public void setUserName(String name) {
			driver.findElement(By.id("name")).sendKeys(name);
		}
		
		public void setMobileNumber(String phone) {
			driver.findElement(By.id("mobile")).sendKeys(phone);
		}
		
		public void setDOB(String dob) {
			driver.findElement(By.id("dob")).sendKeys(dob);
		}
		
		public void setGender(String gender) {
			if(gender.equalsIgnoreCase("male"))
				driver.findElement(By.id("male")).click();
			else
				driver.findElement(By.id("female")).click();
		}
		
		public void setAddress(String address) {
			driver.findElement(By.id("address")).sendKeys(address);
		}
}
