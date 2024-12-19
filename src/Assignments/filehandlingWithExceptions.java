package Assignments;

import java.io.*;

public class filehandlingWithExceptions {

	public static void main(String[] args) throws IOException {
		String filename = "I love java";

		{
			try (FileWriter w = new FileWriter(filename)) {
				w.write("Hello th is sample file\n java program is good");
				System.out.println("File written successfully");
			} catch (IOException e) {
				System.out.println("Error: Unable to write to file :");
				e.printStackTrace();
			}

		}
		
		try {
			BufferedReader r = new BufferedReader(new FileReader(filename));
			String line;
			System.out.println("\n File Contents");
			while((line = r.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}
}
