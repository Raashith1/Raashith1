package tryout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) {
		Scanner infile;
		
		try {
			
			infile = new Scanner(new File("input2.txt"));
			int input;
			while(infile.hasNext()) {
				input = infile.nextInt();
				System.out.println(input);
			}
			infile.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("cant find file");
			System.out.println(ex.getMessage());
			
		}
		
	}

}
