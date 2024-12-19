package Assignments;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class fileReadingAndWriting {

	public static void main(String[] args) {
		try {
			FileWriter W = new FileWriter ("Example.txt");
			W.write("Hello, World!");
			W.close();
			
			FileReader R = new FileReader("Example.txt");
			int c;
			System.out.println("FileContents");
			while((c = R.read())!=-1) {
				System.out.print((char) c);
			}
			R.close();
			} catch (IOException e) {
			
			System.out.println("Error:" +e.getMessage());
		}
		}

}
