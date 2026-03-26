package generic_utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class javaUtility {
	
	//generate random number
	public int getRandomNumber(int range) {
		Random random=new Random();
		int randomNumberInRange=random.nextInt();
		return randomNumberInRange;
	}
	
	//Generate current date
	public String getCurrentDate(String dateformat) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
		return sdf.format(date);
	}
	
	//counting days
	public String getRequiredDate(int days) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		sdf.format(date);
		Calendar cal=sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate=sdf.format(cal.getTime());
		return requiredDate;
	}
	
	//generate Random Value(Alphanumeric)
	public String getRandomValue() {
		UUID randomData=UUID.randomUUID();
		String value=randomData.toString().replaceAll("[^a-zA-Z]","");
		return value;
	}
}