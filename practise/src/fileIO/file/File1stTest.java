package fileIO.file;

import java.io.File;
import java.io.IOException;

public class File1stTest {

	public static void main(String[] args) throws IOException {

		File file = new File("text0");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
	}
}
