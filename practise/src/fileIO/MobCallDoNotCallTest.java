package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MobCallDoNotCallTest {

	public static void main(String[] args) throws IOException {
		
		
		PrintWriter mobCallOutputFile = new PrintWriter("/home/vishwanath/git/practise/practise/DoNotCall/mobCallOutput");
		BufferedReader mobRecFile = new BufferedReader(new FileReader("/home/vishwanath/git/practise/practise/DoNotCall/mobRec")); //create file with data in it
		String mobRecFileLine = mobRecFile.readLine();
		
		while(mobRecFileLine != null) {
			boolean matched = false;
			BufferedReader mobRecDelFile = new BufferedReader(new FileReader("/home/vishwanath/git/practise/practise/DoNotCall/mobRecDel")); //create file with data in it
			String mobRecDelFileLine = mobRecDelFile.readLine();
			//System.out.println("mobRecDelFileLine "+mobRecDelFileLine);
			while(mobRecDelFileLine != null) {
				
				if(mobRecFileLine.equals(mobRecDelFileLine)) {
					matched = true;
					//System.out.println("matched in true: "+matched);
					//break;
				}
				mobRecDelFileLine = mobRecDelFile.readLine();
				//System.out.println("mobRecDelFileLine "+mobRecDelFileLine);
			}
			if(matched == false) {
				mobCallOutputFile.println(mobRecFileLine);
			}
			mobRecFileLine = mobRecFile.readLine(); 
		}
		mobCallOutputFile.flush();
	}
}
