package customerRegistration;

//Testing 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetFormValues {
	public WebDriver driver;
	
	public GetFormValues(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getUserName() {
		return driver.findElement(By.id("name")).getAttribute("value");
	}
	
	public String getMobileNumber() {
		return driver.findElement(By.id("phone")).getAttribute("value");
	}
	
	public String getDOB() {
		return driver.findElement(By.id("dob")).getAttribute("value");
	}
	
	public String getGender() {
		String res="";
		if(driver.findElement(By.id("male")).isSelected())
			res="Male";
		else
			res="Female";
		return res;
	}
	
	public String getAddress() {
		return driver.findElement(By.id("address")).getAttribute("value");
	}
}
