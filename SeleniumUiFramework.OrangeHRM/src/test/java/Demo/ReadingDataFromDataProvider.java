package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	
	@DataProvider(name="Sample")
	Object[][]getdata(){
		return new Object[][] {
			{"Browser","firefox"},
			{"username","password"},
			{"Admin","admin123"}
	};

}
	
	@DataProvider(name="Sample1")
	Object[][]getInfo(){
		return new Object[][] {
			{"Browser","chrome"},
			{"username","password"},
			{"User","user123"}
	};

}
	@Test(dataProvider="Sample1")
	public void readingFromDataProvider(String key,String value) {
		System.out.println("My key is : "+key+"    My value is : "+value);
	}
}