package oops1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListToArray1 {
public static void main(String[] args) {
	List<Integer> ls = new LinkedList<>();
	ls.add(60000);
	ls.add(6000);
	ls.add(600);
	ls.add(60);
	ls.add(6);
	ArrayList<Integer> ss = new ArrayList<>(ls);
	for (Integer integer : ss) {
		System.out.println(integer);
		
	}
	System.out.println(ss.get(4));
	System.out.println(ss.get(3));
	System.out.println(ss.get(2));
	System.out.println(ss.get(1));
	System.out.println(ss.get(0));
	
}
}
