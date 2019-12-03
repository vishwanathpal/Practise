package fileIO.file.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadMethodTest1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("/home/vishwanath/Desktop/tesrt");
		int i = fr.read();
		
		while (i != -1)  {
			System.out.println((char) i);
			i = fr.read();
		}
	}
}
