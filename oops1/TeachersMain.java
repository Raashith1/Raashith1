package oops1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TeachersMain {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		
		t.setFirstName("Mary");
		t.setLastName("louise");
		t.setEmployeeId("100");
		
		Teacher t1=new Teacher();
		t1.setFirstName("Ravi");
		t1.setLastName("chandran");
		t1.setEmployeeId("101");
		
		Teacher t2=new Teacher();
		t2.setFirstName("kishore");
		t2.setLastName("reddy");
		t2.setEmployeeId("102");
		
		Teacher t3=new Teacher();
		t3.setFirstName("Ravi");
		t3.setLastName("chandran");
		t3.setEmployeeId("103");
		
		
		
//		List<Teacher> teacherlist=new LinkedList<>();
//		teacherlist.add(t);
//		teacherlist.add(t1);
//		teacherlist.add(t2);
//		
//		System.out.println(teacherlist);
//		
//		for (Teacher string : teacherlist) {
//			System.out.println(string);
//			
//		}
		
		Set<Teacher> set1 = new HashSet<>();
		set1.add(t);
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		
		for (Teacher teacher : set1) { 
			System.out.println(teacher);
		}
		
	
		
	}

}
