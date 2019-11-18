package practise;

import java.util.Calendar;

public class StringArray {

	public static void main(String[] args) 
	{
		Integer ageCalculate;
		Integer age = 24;
		String mydata = "1986-12-31";
		
		String[] parsing = mydata.split("-");		
		Calendar calendar = Calendar.getInstance();
		
		int today = calendar.get(Calendar.YEAR);
		
		ageCalculate = today - Integer.parseInt(parsing[0]);
		
		if(age<ageCalculate)
			System.out.println("you are not eligible for registration: "+ageCalculate);
		else
			System.out.println("go head for registration: "+ageCalculate);
		/*
		 * System.out.println(parsing[0]);
		 * 
		 * for(String par : parsing) { System.out.println(par.substring(0, 2));
		 * 
		 * }
		 */
		
	}
	
	
}
