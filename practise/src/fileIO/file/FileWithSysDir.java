package fileIO.file;

import java.io.File;
import java.io.IOException;

public class FileWithSysDir {

	public static void main(String[] args) throws IOException {

		File file = new File("/home/vishwanath/Desktop", "tesrt");
		file.createNewFile();
	}
}
//write a code to create name with "abc.text" in "e://xyz" folder