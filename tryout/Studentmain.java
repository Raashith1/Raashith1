package tryout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Studentmain {
	public static void main(String[] args) {

		
		

				List<String> firstname = new ArrayList<String>();
				firstname.add("RAVI");
				firstname.add("RAJESH");
				firstname.add("BHARATH");
				firstname.add("RAM");
				firstname.add("ARAVINDH");
				firstname.add("SUHAIL");
				
				
				List<String> lastname = new ArrayList<String>();
				lastname.add("KUMAR");
				lastname.add("REDDY");
				lastname.add("RAO");
				lastname.add("SHARMA");
				lastname.add("SINGH");
				lastname.add("AHAMED");

				List<Student> studentList = new LinkedList<Student>();

				Random random = new Random();
				for (int i = 0; i < 10000; i++) {

					Student student = new Student();
					String firstnames = firstname.get(random.nextInt(firstname.size()));
					student.setFirstname(firstnames);
					String lastnames = lastname.get(random.nextInt(lastname.size()));
					student.setLastname(lastnames);

					studentList.add(student);
				}

				for (Student student : studentList) {
					System.out.println(student.toString());
				}
			}

			
		
	}


