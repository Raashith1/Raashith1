package oops1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factormain {
	public static void main(String[] args) {
		Factor factor = new Factor();
	//	factor.getfactor(10000);
//		Map<Integer,Integer> map1 = new HashMap<>();
//		map1.put(1, j);
		
		
		
		
		
		
		Map<Integer,List<Integer>> map1 = new HashMap<>();
		for (int i = 1; i <= 60; i++) {
           List<Integer> value = factor.getfactor(i);
			map1.put(i,value);
			
		}
		
		
		for (Integer integer1 : map1.keySet()) {
			
			System.out.println(map1.get(integer1));
			System.out.println("---------------------------------");
			
		}
		
	}

}
