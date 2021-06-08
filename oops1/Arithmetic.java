package oops1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arithmetic {
	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<>();
		list1.add(89);
		list1.add(678);
		list1.add(500);
		list1.add(55);
		list1.add(34);
		list1.add(89);
		list1.add(500);
//		for (Integer integer : list1) {
//			System.out.println(integer);
//		}
	
		Set<Integer> sets=new HashSet<>();
		sets.add(89);
		sets.add(678);
		sets.add(89);
		sets.add(16);
		sets.add(500);
		sets.add(500);
		
		for (Integer integer : sets) {
			System.out.println(integer);
		}
		
		
		
	}

}
