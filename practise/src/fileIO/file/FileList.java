package fileIO.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileList {

	public static void main(String[] args) {
		int count = 0;
		Map<String, String> map = new HashMap<String, String>();

		File file = new File("/home/vishwanath/Desktop");
		String s[] = file.list();
		for (String files : s) {

			File f = new File(file, files);
			if (f.isFile()) {
				map.put("file: " + count, files);
				// count++;
			} else if (f.isDirectory()) {
				map.put("dir: " + count, files);
				// count++;
			} else {
				map.put("other: " + count, files);
				// count++;
			}
			count++;
		}
		System.out.println(map);
	}
}
//Write a program to display all the files and directory present in c://test

// simple listout the file & directory and stor in the map object
/*
 * public static void main(String[] args) { int count = 0; Map<Integer, String>
 * map = new HashMap<Integer, String>();
 * 
 * File file = new File("/home/vishwanath/Desktop"); String s[] = file.list();
 * for(String files : s) {
 * 
 * map.put(count, files); count++; //System.out.println(files); }
 * System.out.println(map); }
 */
