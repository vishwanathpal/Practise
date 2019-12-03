package fileIO.file.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadMethodTest2 {

	public static void main(String[] args) throws IOException {

		File file = new File("/home/vishwanath/Desktop/tesrt");
		char [] ch = new char[(int) file.length()];
		FileReader fr = new FileReader(file);		
	
		fr.read(ch);
		for(char chs : ch) {
			System.out.println(chs);
		}
	}
}
