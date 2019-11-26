package collectionframework.arraylist.customarraylist;

import java.util.ArrayList;

public class ArrayListWithCustomImple {

	// size of input 4
	int n = 4;

	class Data {

		// global variables of the class
		int roll;
		String name;
		int marks;
		long phone;

		public Data(int roll, String name, int marks, long phone) {
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}
	}

	public static void main(String[] args) {

		// suppose the custom input data
		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "Shubham", "Atul", "Ayush", "Rupesh" };
		int marks[] = { 100, 99, 93, 94 };
		long phone[] = { 8762357381L, 8762357382L, 8762357383L, 8762357384L };

		ArrayListWithCustomImple custom = new ArrayListWithCustomImple();
		custom.addValues(roll, name, marks, phone);
		System.out.println(Data.class.getName());
	}

	private void addValues(int[] roll, String[] name, int[] marks, long[] phone) {

		ArrayList<Data> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			list.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}
		printValues(list);

	} 

	private void printValues(ArrayList<Data> list) {

		for (int i = 0; i < n; i++) {

			Data data = list.get(i);
			System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
		}
	}
}
