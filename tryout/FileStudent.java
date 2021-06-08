package tryout;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class FileStudent {
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("group.csv");
		ArrayList<String> namelist = new ArrayList<>();
		ArrayList<String> agelist = new ArrayList<>();
		ArrayList<String> districtlist = new ArrayList<>();
		
		namelist.add("Raj");
		namelist.add("Rahul");
		namelist.add("Ravi");
		namelist.add("Ram");
		namelist.add("Sanjay");
		namelist.add("Salim");
		
		agelist.add("21");
		agelist.add("18");
		agelist.add("17");
		agelist.add("18");
		agelist.add("18");
		agelist.add("19");
		
		districtlist.add("Thanjavur");
		districtlist.add("Thanjavur");
		districtlist.add("Kanyakumari");
		districtlist.add("Trichy");
		districtlist.add("Thanjavur");
		districtlist.add("Trichy");
		
		
		  
			  Random rand = new Random();

		List<Person> studentList = new LinkedList<Person>();
		
		List<String>  list = new LinkedList<>();
		List<String>  list1 = new LinkedList<>();
		List<String>  list2 = new LinkedList<>();

		for (int i = 0; i < namelist.size(); i++) {

			Person student = new Person();
			String Name = namelist.get(rand.nextInt(namelist.size()));
			student.setName(Name);
			String Age = agelist.get(rand.nextInt(agelist.size()));
			student.setAge(Age);
			String District = districtlist.get(rand.nextInt(districtlist.size()));
			student.setDistrict(District);
          if(District=="Thanjavur") {
        	  list.add(Name);
          }
          else if(District=="Trichy") {
        	  list1.add(Name);
          }
          else if(District=="Kanyakumari") {
        	  list2.add(Name);
          }
        
			studentList.add(student);
		}

		for (Person ps : studentList) {
			System.out.println(ps.toString());
		}
	System.out.println("-----------------------------------------");
	
	
	 Map<String, List<String>> districtGroup = new HashMap<String,
			 List<String>>();
	
		

	districtGroup.put("Thanjavur", list);
	districtGroup.put("Trichy", list1);
	districtGroup.put("Kanyakumari", list2);
		
	
	
	System.out.println("District\t"+"Names");
	pw.println("District,"+"Names");
		
	for (String key : districtGroup.keySet()) {
		
	    // System.out.println(districtGroup.get(key));
	     
	     if(key=="Thanjavur") {
	    	 System.out.print("Thanjavur "+"\t");
	    	 pw.print("Thanjavur,");
	    	 System.out.println(districtGroup.get(key));
	    	 pw.println(districtGroup.get(key));
	     }
	     
	     else if(key=="Trichy") {
	    	 System.out.print("Trichy  "+"\t");
	    	 pw.print("Trichy,");
	    	 System.out.println(districtGroup.get(key));
	    	 pw.println(districtGroup.get(key));
	     }
	     
	     else if(key=="Kanyakumari") {
	    	 System.out.print("Kanyakumari "+"\t");
	    	 pw.print("Kanyakumari,");
	    	 System.out.println(districtGroup.get(key));
	    	 pw.println(districtGroup.get(key));
	     }
		
	}
	 
	pw.close();
	
	

	 
	 
	 
     }
	
	
	
	}


