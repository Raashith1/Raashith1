package oops;
import java.util.Scanner;

public class NameParse {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your Full name?");
		String fullname = keyboard.nextLine();
		
		int indexOfSpace=fullname.indexOf(" ");
		
		String firstname = fullname.substring(0, indexOfSpace);
		String lastname = fullname.substring(indexOfSpace);
		
		System.out.println("Your First Name is "+firstname);
		System.out.println("Your Last name is"+lastname);
	}

}
