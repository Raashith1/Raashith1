package oops1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] arr1=new int[20];
		for(int i=0;i<5;i++) {
			arr1[i]=input.nextInt();
			
			}
		for(int i=0;i<5;i++) {
			
			System.out.println(arr1[i]);
			}
		List<Integer> input1=new LinkedList<>();
		for(int index=0;index<5;index++) {
			input1.add(arr1[index]);
			
		}
		
		Arrays.asList(arr1);
		System.out.println(input1);
		
		for(int index=0;index<5;index++) {
			System.out.println("Element at location "+ index+"  is " +input1.get(index));
			
		}
	}
}


