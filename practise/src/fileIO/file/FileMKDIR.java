package fileIO.file;

import java.io.File;
import java.io.IOException;

public class FileMKDIR {

	public static void main(String[] args) throws IOException {

		File file = new File("text001");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
	}
}