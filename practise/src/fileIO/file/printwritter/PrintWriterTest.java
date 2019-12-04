package fileIO.file.printwritter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc1.text");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100); // d
		pw.println();
		pw.println(100); // 100
		pw.println(true);
		pw.println('c');
		pw.println("String");
		pw.flush();
		pw.close();
	}
}
