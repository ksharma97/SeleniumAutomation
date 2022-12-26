package JyotiProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	 public void sendText(WebDriver driver,By Element,String Value)
	 {
		 driver.findElement(Element).sendKeys(Value);
	 }
	 
	 public void ClickElement(WebDriver driver,By Element)
	 {
		driver.findElement(Element).click(); 
	 }
	 
	 public void ClearText(WebDriver driver,By Element)
	 {
		driver.findElement(Element).clear();
	 }
	 
	public void DropDownSelect(WebDriver driver,By Element ,String Value)
	{
		WebElement ElementValue = driver.findElement(Element);
		Select _select = new Select(ElementValue);
		_select.selectByVisibleText(Value);
	}
	
	public void GetListofElements(WebDriver driver,By Element)
	{
		  List<WebElement> anchors = driver.findElements(Element);      
		    for (WebElement ele:anchors)
		        System.out.println(ele.getText());
	}
	
	public void DescendingOrderCheck(WebDriver driver,By Element)
	{
		  List<WebElement> anchors = driver.findElements(Element);      
		    for (WebElement ele:anchors)
		        System.out.println(ele.getText());
	}

}
