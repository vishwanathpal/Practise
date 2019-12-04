package fileIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class RemoveDuplicateMobNo {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("/home/vishwanath/git/practise/practise/DuplicateMobNo/uniqMobNo");
		BufferedReader dupMobNoFile = new BufferedReader(new FileReader("/home/vishwanath/git/practise/practise/DuplicateMobNo/dupMobNo"));
		
		String dupString = dupMobNoFile.readLine();
		
		while(dupString != null) {
			
			boolean available = false;
		
			BufferedReader uniqMobNoFile = new BufferedReader(new FileReader("/home/vishwanath/git/practise/practise/DuplicateMobNo/uniqMobNo"));
			String uniqString = uniqMobNoFile.readLine();
			 
			while(uniqString != null) {
				
				if(dupString.equals(uniqString)) {
					available = true;
				}
				 uniqString = uniqMobNoFile.readLine();
			 }
			 if(available == false) {
				pw.println(dupString);
				pw.flush();
			}
			 dupString = dupMobNoFile.readLine();
		}
	}
}
