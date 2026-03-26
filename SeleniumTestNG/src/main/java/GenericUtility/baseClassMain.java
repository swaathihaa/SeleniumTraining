package GenericUtility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseClassMain {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing beforeClass");
	}
	
	@Test
	public void test() {
		System.out.println("Executing test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Executing afterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Executing afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing afterSuite");
	}
	
}
