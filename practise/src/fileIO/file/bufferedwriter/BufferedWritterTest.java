package fileIO.file.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTest {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.text"); 
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','d','g'};
		bw.write(ch);
		bw.newLine();
		bw.write("vadodara");
		bw.newLine();
		bw.write("hellios solution");
		bw.flush();
		bw.close();
	}

}
