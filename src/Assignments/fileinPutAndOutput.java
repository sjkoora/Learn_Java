package Assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileinPutAndOutput {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileWriter W = new FileWriter("Sample.txt");
			W.write("");
			W.close();
			FileReader R =new FileReader("Sample.txt");
			int ch;
			while((ch = R.read())!=-1) {
				System.out.print((char)ch);
			}
			R.close();
		} catch (IOException e) {
			
			System.out.println("Error" +e.getMessage());
		}
		

	}

}
