package collectionframework.arraylist.customarraylist;

import java.util.ArrayList;

public class WithoutCustomArrayList {

	public static void main(String args[]) {
		// suppose the custom input data
		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "Shubham", "Atul", "Ayush", "Rupesh" };
		int marks[] = { 100, 99, 93, 94 };
		long phone[] = { 8762357381L, 8762357382L, 8762357383L, 8762357384L };

		// roll number arraylist
		ArrayList<Integer> rolles = new ArrayList<>();

		// name arraylist
		ArrayList<String> names = new ArrayList<>();

		// marks arraylist
		ArrayList<Integer> markss = new ArrayList<>();

		// phone number arraylist
		ArrayList<Long> phones = new ArrayList<>();

		// and for n students
		for (int i = 0; i < roll.length; i++) {
			// add all the values to each arraylist
			// each arraylist has primitive datatypes

			rolles.add(roll[i]);
			names.add(name[i]);
			markss.add(marks[i]);
			phones.add(phone[i]);
		}
		System.out.println(rolles+" "+names+" "+markss+" "+phones);
	}
}
//reference: https://www.geeksforgeeks.org/custom-arraylist-java/