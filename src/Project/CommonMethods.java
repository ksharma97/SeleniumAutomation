package Project;

import java.io.FileInputStream;

public class CommonMethods {
	public static WebElement element;
	Properties prop = new Properties();
	public InputStream input = null;
	 public void loadData()
	 {
		 try 
		 {
			input = new FileInputStream(System.getProperty("user.dir")+"/src/Drivers/Configuration.Properties");
			prop.load(input);
		 } 
		 catch (Exception e) 
		 {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public String ReadProperty(String Value)
	 {
		 String value ;
		 loadData();
		 return prop.getProperty(Value);
	 }
	 
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
