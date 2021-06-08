package oops1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		 Scanner in = new Scanner(System.in); 
	        int n = 5; 
	        Integer userInput;
	        for(int i = 0; i<n; i++){

	            userInput = in.nextInt(); 
	            arr.add(userInput); 
	        }
	        System.out.println(arr);

		Collections.sort(arr);
		System.out.println(arr);
		
	}

}
