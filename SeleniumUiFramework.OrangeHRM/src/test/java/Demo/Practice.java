package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void readData() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		System.out.println(URL);
		String Browser=prop.getProperty("browser");
		String ValidUsername=prop.getProperty("username");
		String ValidPassword=prop.getProperty("password");
		
		System.out.println("Url of the application is : "+URL);
		System.out.println("Default Browser is : "+Browser);
		System.out.println("Uername : "+ValidUsername);
		System.out.println("Password : "+ValidPassword);
		
		//write
		FileOutputStream fos=new FileOutputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");
		prop.setProperty("candidate_name", "Thomas");
		prop.store(fos,null);
	}
}
