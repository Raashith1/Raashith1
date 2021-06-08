package oops1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMain {
	public static  void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Aravindh");
		student1.setLastName("kumar");
		student1.setRollno(99);
		
		Student student2 = new Student();
		student2.setFirstName("Sasi");
		student2.setLastName("reddy");
		student2.setRollno(100);
		
		Student student3 = new Student();
		student3.setFirstName("Mohit");
		student3.setLastName("rao");
		student3.setRollno(101);
		
		Student student4 = new Student();
		student4.setFirstName("Raj");
		student4.setLastName("kumar");
		student4.setRollno(102);
		
		Student student5 = new Student();
		student5.setFirstName("Ram");
		student5.setLastName("singh");
		student5.setRollno(103);
		
		Student student6 = new Student();
		student6.setFirstName("Saravana");
		student6.setLastName("sharma");
		student6.setRollno(104);
		
		Student student7 = new Student();
		student7.setFirstName("Vijay");
		student7.setLastName("shankar");
		student7.setRollno(105);
		
		
		
		Map<Integer,Student> map1 = new HashMap<>();
		map1.put(100, student2);
		map1.put(101, student3);
		map1.put(102, student4);
		map1.put(103, student5);
		map1.put(104,student6);
		map1.put(100,student7);
		
	for (Integer string : map1.keySet()) {
		System.out.println(map1.get(string));
		
	}
	
	System.out.println("------------------------------");

	Map<String,Student> map2 = new HashMap<>();
	map2.put("Aravindh", student2);
	map2.put("Sasi", student3);
	map2.put("Mohit", student4);
	map2.put("Raj", student5);
	map2.put("Ram",student6);
	map2.put("Saravana",student7);
	
		for (String string1 : map2.keySet()) {
		System.out.println(map2.get(string1));
			}
		
		System.out.println("------------------------------");

		Map<String,Student> map3 = new HashMap<>();
		map3.put( "kumar", student2);
		map3.put( "reddy", student3);
		map3.put( "rao", student4);
		map3.put( "shankar", student5);
		map3.put( "sharma",student6);
		map3.put( "singh",student7);
		
			for (String string2 : map3.keySet()) {
			System.out.println(map3.get(string2));
				}

	}
	
}
