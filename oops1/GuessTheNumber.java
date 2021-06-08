package oops1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ourGuess;
		
		int guessCount=0;
		int computerNumber;
		Random random = new Random();
		computerNumber = random.nextInt(100) + 1;
		boolean guessedNumber = false;
		
		while(!guessedNumber) {
			System.out.println("Enter the integer guess");
			ourGuess = sc.nextInt();
			guessCount++;
			
			if(ourGuess>=1 && ourGuess<=100) {
				if(ourGuess == computerNumber) {
					System.out.println("Congratulaions your guess is correct \n"+guessCount+" guessess!  Thanks for playing");
					guessedNumber=true;
				}
				else if(ourGuess > computerNumber) {
					System.out.println("Your Guess is too high");
				}
				else {
					System.out.println("Your Guess is too low");
				}
			}
			else {
				System.out.println("This is wasted guess try another");
			}
			
		}
		
	}

}
