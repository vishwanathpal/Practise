package fileIO;

import java.io.*;

public class FileMerageTest {
	
	public static void main(String arg[]) throws IOException {
		
		PrintWriter pw = new PrintWriter("file3");
		//File file3 = new File("/home/vishwanath/git/Practise/Practise/file3");
		BufferedReader br = new BufferedReader(new FileReader("file1")); //create file with data in it
		BufferedReader br1 = new BufferedReader(new FileReader("file2")); //create file with data in it
		String line = br.readLine();
		String line1 = br1.readLine();
		
		while(line != null || line1 != null) {
			pw.println(line);
			pw.println(line1);
			line = br.readLine();
			line1 = br1.readLine();
		}
		pw.flush();
		pw.close();
	}
}

// to merage operation and above code to merage but alternative lines
/*
 * public static void main(String arg[]) throws IOException {
 * 
 * PrintWriter pw = new PrintWriter("file3"); //File file3 = new
 * File("/home/vishwanath/git/Practise/Practise/file3"); BufferedReader br = new
 * BufferedReader(new FileReader("file1")); String line = br.readLine();
 * 
 * while(line != null) { pw.println(line); line = br.readLine(); } br = new
 * BufferedReader(new FileReader("file2")); line = br.readLine();
 * 
 * while(line != null) { pw.println(line); line = br.readLine(); } pw.flush();
 * pw.close(); }
 */