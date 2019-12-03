package fileIO.file;

import java.io.File;
import java.io.IOException;

public class FileWithSubDirectory {

	public static void main(String[] args) throws IOException {

		File fileD = new File("mydir");
		fileD.mkdir();
		File fileF = new File(fileD, "myfile");
		fileF.createNewFile();
	}
}
//write code to create a directory name with "mydir" in current working directory and create file name with "demo.text" in that directory.