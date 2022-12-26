package Project;

public class DriverMethods {
	public static WebDriver driver;
	public static WebDriver chromeDriver()
	 {
		 try
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Study\\eclipse-workspace\\MiniProject\\Extracts\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");
//			 return driver;
			 
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Error while creating Chrome Driver");
		 }
		return driver;
		 
	 }
	 
	 public static WebDriver firefoxDriver()
	 {
		 try
		 {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Study\\eclipse-workspace\\MiniProject\\Extracts\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com");
    		 return driver;
			 
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Error while creating Firefox Driver");
		 }
		return driver;
	 }
}
