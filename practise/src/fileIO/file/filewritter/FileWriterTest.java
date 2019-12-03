package fileIO.file.filewritter;

import java.io.*;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		char ch[] = {'a','b','x','x'};
		//constructor to override data.
		//FileWriter fw = new FileWriter("tesrt");
		FileWriter fw = new FileWriter("tesrt", true);
		fw.write(100);
		fw.write("-days");
		fw.write("\n");
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
