package workingWithTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupAnnotationPractice {
	public static Object[] name;
	public static String password;
	
	@DataProvider
	public static Object[] initializeName() {
		return name;
	}
	
	@Test()
	public static void initializePassword() {
		password="Kundan";
	}
	
	
	@Test(dataProvider ="initializeName")
	public static void printName() {
		System.out.println("Name is " +name);
	}
	
	@Test(dependsOnGroups= {"init"})
	public static void printPassword() {
		System.out.println("Password is " +password);
	}
}
