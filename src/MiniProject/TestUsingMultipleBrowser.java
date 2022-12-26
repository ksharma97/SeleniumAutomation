package MiniProject;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;

public class TestUsingMultipleBrowser {
	public static WebDriver driver;
	
	//Function to setup ChromeDriver
	public  void createChromeDriver(){
		driver = DriverSetup.getChromeDriver(); //get the Chrome driver from DriverSetup class
		System.out.println("Title is : " +driver.getTitle());
	}
	
	//function to setup EdgeDriver
	public void createFirefoxDriver() {
		driver = DriverSetup.getFirefoxDriver(); //get the Firefox driver from DriverSetup class
		System.out.println("Title is : " +driver.getTitle());
	}
	//Function to click on "Schools" tab 
	public void schoolTab() {
		driver.findElement(By.linkText("Schools")).click(); //locate the Schools link using xpath and click it
		
	}
	
	//function to select course from "Course" dropdown 
	public void selectCourse() throws IOException {
		Select s =new Select(driver.findElement(By.id("ddl_Category"))); //Locate the Course dropdown
		s.selectByVisibleText(DataDriven.getCourse()); //select CBSE in course dropdown
		System.out.println("Selected Course Value is :  " + s.getFirstSelectedOption().getText());
	}
	
	//function to select course from "City" dropdown 
		public void selectCity() throws IOException {
			Select s =new Select(driver.findElement(By.id("ddl_City"))); //Locate the City dropdown
			s.selectByVisibleText(DataDriven.getCity()); //Select Guwahati in City dropdown
			System.out.println("Selected Course Value is :  " + s.getFirstSelectedOption().getText());
		}
		
	//function to click on the search button
		public void clickSearch() {
			driver.findElement(By.id("btnSearch")).click(); //Locate and Click on the search button using id
		}
		
		//function to get the list of top five schools
		public void getSchools() {
			List<WebElement> schools =  driver.findElements(By.xpath("//div[@class='detail-list']/ul/li/div[2]/a"));
			System.out.println("Number of Schools listed in First Page is : " + schools.size());
			for(WebElement s : schools) {
				System.out.println(s.getText());
			}
		}
		
		//function to the close the browser
		public void closeBrowser() {
			driver.quit(); //code to close the browser
		}
		
	public static void main(String args[]) throws IOException{
		
		TestUsingMultipleBrowser te= new TestUsingMultipleBrowser(); //Creating an object of the class
		
		//Code for chrome driver
		te.createChromeDriver(); //calling the createDriver() to setup Chrome driver
		te.schoolTab(); //calling the schoolTab() to click on the school
		te.selectCourse(); //calling the selectCourse()  to select a Course 
		te.selectCity(); //Calling the selectCity() to select a city
		te.clickSearch(); //Calling the clcikSearch() to click on the search button.
		te.getSchools(); //Calling the getSchools() to print the name of results
		te.closeBrowser(); //Closing the browser
	
//		code for firefox browser
		te.createFirefoxDriver(); //Calling the function to setup edge driver
		te.schoolTab(); //calling the function to click on schools link 
		te.selectCourse(); //calling the function to select course 
		te.selectCity(); //calling the function to select city
		te.clickSearch(); //calling the function to click search button
		te.getSchools(); //calling the function to click get List of schools
		te.closeBrowser(); //close the browser
		
	}
}
