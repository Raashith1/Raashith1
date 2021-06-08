package tryout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutput {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("gunal");
	names.add("ganesh");
	names.add("guru");
	names.add("gandhi");
	try {
		PrintWriter pw = new PrintWriter("names.txt");
		for (String string : names) {
			pw.println(string);
		}
		pw.close();
	}
	catch(FileNotFoundException ex) {
		System.out.println("file not found");
	}
	
}
}
