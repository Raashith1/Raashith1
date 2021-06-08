package oops1;

import java.util.LinkedList;
import java.util.List;

public class SumList {
	public static void main(String[] args) {
		
		Sum();
		
	}
	
	private static void Sum() {
		// TODO Auto-generated method stub
		List<Integer> s = new LinkedList<>();
		s.add(5);
		s.add(12);
		s.add(67);
		int sum=0;
		for(int i=0;i<s.size();i++) {
			sum = sum + s.get(i);
		}
		System.out.println(sum);

	}

}
