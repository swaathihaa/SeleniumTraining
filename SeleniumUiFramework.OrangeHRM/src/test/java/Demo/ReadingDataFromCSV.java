package Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadingDataFromCSV {
	@Test
	public void readcsv() throws IOException {
		String line="";
		
		BufferedReader br=new BufferedReader(new FileReader("./src/test/resources/OrangeHRM_CommonData/sample.csv"));
		while((line=br.readLine())!=null) {
			String data[]=line.split(",");
			String d1 = data[0];
			String d2 = data[1];
			System.out.print(d1);
			System.out.println(" "+d2);
		}
	}
}
