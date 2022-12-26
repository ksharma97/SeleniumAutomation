package JyotiProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import Project.DriverMethods;

public class HotelAvailability {
	public static WebDriver driver;
	public static WebElement element;
//	DriverMethods driverInstance = new DriverMethods();
	CommonMethods commonMethods = new CommonMethods();
	
	private By EnterDestination = By.id("querytext");
	private By CheckIn = By.xpath("//button[@class='dealform-button js-dealform-button-calendar dealform-button--checkin' and @key='checkInButton']");
	private By StartDate = By.xpath("//time[@datetime='2021-02-26']");
	private By EndDate = By.xpath("//time[@datetime='2021-02-27']");
	private By AdultCount = By.id("adults-input");
	private By RoomsCount = By.id("rooms-input");
	private By ApplyCount = By.xpath("//button[text(),'Apply'");
	private By Search = By.xpath("//button[@class='btn btn--primary btn--regular search-button js-search-button' and @data-qa='search-button']");
	private By SortBy = By.id("mf-select-sortby");
	private By HotelList = By.xpath("//span[@class='item-link name__copytext name__copytext--small' and @data-qa='item-name']");
	private By RatingList = By.xpath("//span[@itemprop='ratingValue']");
	public void OpenTheApplicationURL(String browser)
	{
		try
		{
			if(browser.equalsIgnoreCase("CHROME"))
			{
				driver = DriverSetup.getChromeDriver();
			}
			else if(browser.equalsIgnoreCase("FIREFOX"))
			{
				driver = DriverSetup.getFirefoxDriver();
			}
			else
			{
				System.out.println("Driver is not declared");
			}
			driver.get("https://www.trivago.in");
		}
		catch(Exception ex)
		{
			System.out.println("Exception during Driver Creation"+ex.getMessage());
		}
	}
	
	public void EnterDestination() 
	{
		try
		{
			commonMethods.sendText(driver,EnterDestination, "Mumbai");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void SelectDates() 
	{
		try
		{
			commonMethods.ClickElement(driver,CheckIn);
			Thread.sleep(2000);
			commonMethods.ClickElement(driver,StartDate);
			commonMethods.ClickElement(driver,EndDate);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	
	public void SelectRoomandOccupancy() 
	{
		try
		{
			commonMethods.ClearText(driver,CheckIn);
			commonMethods.ClearText(driver,AdultCount);
			commonMethods.sendText(driver,AdultCount, "1");
			commonMethods.ClearText(driver,RoomsCount);
			commonMethods.sendText(driver,RoomsCount, "1");
			commonMethods.ClickElement(driver,ApplyCount);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void SearchRooms() 
	{
		try
		{
			commonMethods.ClickElement(driver,Search);
			Thread.sleep(3000);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void SortByRating() 
	{
		try
		{
			commonMethods.DropDownSelect(driver, SortBy, "Rating only");
			Thread.sleep(10000);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void ListofRentofHotels() 
	{
		try
		{
			commonMethods.GetListofElements(driver,HotelList);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void DescendingOrderCheck() 
	{
		try
		{
			commonMethods.DescendingOrderCheck(driver,RatingList);		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public void CloseBrowser() 
	{
		try
		{
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
