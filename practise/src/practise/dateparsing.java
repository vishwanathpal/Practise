package practise;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dateparsing {

	
	
	public static void main(String[] args) {
		String mydata = "2009-12-31";
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		Pattern pattern = Pattern.compile("\\A\\w+");
		Matcher matcher = pattern.matcher(mydata);
		
		
		
		
		System.out.println(calendar.get(Calendar.YEAR));
		//System.out.println(matcher.g);
		System.out.println(matcher);

	}
	
	
	
}
