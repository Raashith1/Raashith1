package tryout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWords {
	public static void main(String[] args) {
		Scanner inpfile;
		try {
			inpfile = new Scanner(new File("input3.txt"));
			String input;
			while (inpfile.hasNext()) {
				input = inpfile.nextLine();
				//System.out.println(input);
			}
			inpfile.close();

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			inpfile = new Scanner(new File("input3.txt"));
			PrintWriter pw = new PrintWriter("output1.txt");
			PrintWriter pw1 = new PrintWriter("Four.txt");
			PrintWriter pw2 = new PrintWriter("Five.txt");
			String input1;
			while (inpfile.hasNext()) {
				input1 = inpfile.nextLine();
				System.out.println();

				String[] input2 = input1.split("\\s+");
			

				for (String string : input2) {
					String string1 = string.replaceAll("[^a-zA-Z]", " ");
					System.out.println(string);
					pw.println(string);
					if (string1.length() == 4) {
						System.out.println(string1);
						pw1.println(string1);
					} else if (string1.length() == 5) {
						System.out.println(string1);
						pw2.println(string1);
					}
				}

			}

			pw.close();
			pw1.close();
			pw2.close();
			inpfile.close();

		} catch (

		FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
