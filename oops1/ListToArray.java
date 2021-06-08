package oops1;

import java.util.LinkedList;
import java.util.List;


public class ListToArray {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(9);
		list.add(500);
		list.add(5000);
		
		int[] array = new int[list.size()];
		for(int index=0;index<list.size();index++) {
			array[index]=list.get(index);
		}
		for(int index=0;index<list.size();index++) {
			System.out.println(array[index]);
		}
		
//		System.out.println(object[3]);
//		System.out.println(object[2]);
//		System.out.println(object[1]);
//		System.out.println(object[0]);
	
	}

}
