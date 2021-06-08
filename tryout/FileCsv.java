package tryout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileCsv {
	public static void main(String[] args) {
		
		
		
		//Scanner inputfile;
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> age = new ArrayList<>();
		ArrayList<String> country = new ArrayList<>();
	//	Map<NameAge,ArrayList<String> > r= new HashMap<>();
//		Map<NameAge,ArrayList<String> > map1 = new HashMap<>();
//		Map<NameAge,ArrayList<String> > map2 = new HashMap<>();
		try {
			//inputfile = new Scanner(new File("book1.csv"));
			//PrintWriter pw = new PrintWriter("book2.csv");
			PrintWriter pw1 = new PrintWriter("book3.csv");
			String input;
			
			//	input = inputfile.nextLine();
				
			//	System.out.println(input);
			name.add("Rahul");
			name.add("Ravi");
			name.add("Ram");
			name.add("Sanjay");
			name.add("Salim");
			name.add("Sathish");
			name.add("Sam");
			
			age.add("21");
			age.add("18");
			age.add("17");
			age.add("18");
			age.add("18");
			age.add("19");
			age.add("20");
			
			country.add("India");
			country.add("Australia");
			country.add("Sri lanka");
			country.add("India");
			country.add("India");
			country.add("India");
			country.add("India");
			
			List<Map<String,Object>> list = new ArrayList<>();
				
			for (int i = 0; i < name.size(); i++) {
					
					NameAge na = new NameAge();
				String Name = name.get(i);
				String Age = age.get(i);
				String Country = country.get(i);
				na.setName(Name);
				na.setAge(Age);
				na.setCountry(Country);
			}
				
				Map<String,Object> recordMap = new HashMap<>();
				recordMap.put("Name", name);
				recordMap.put("Age", age);
				recordMap.put("Country", country);
				

				
				
				
				list.add( recordMap);
				
				
				
				System.out.println("Name\t"+"Age\t"+"Country");
				pw1.println("Name,"+"Age,"+"Country");
				
				StringBuilder sc = new StringBuilder();
				
				
				for (Map<String, Object> map : list) {
					
					for (String key : map.keySet()) {
						
					
						System.out.println(map.get(key)  );
						
						
					}
					
					//System.out.println(nameAge.toString());
//					System.out.print(recordMap.get()+"\t");
//					
//					System.out.print(nameAge.getAge()+"\t");
//					
//					System.out.println(nameAge.getCountry());
					
                    for (String key : map.keySet()) {
                    	
						pw1.println(map.get(key));
						
						
					}
					
//                    StringBuilder sc = new StringBuilder();
//    				sc.append(",");
//					pw1.println(nameAge.getName()+","+nameAge.getAge()+","+nameAge.getCountry());
					
				}
				
//				System.out.println("Name\t"+"Age\t"+"Country");
//				pw.println("Name,"+"Age,"+"Country");
//			
//			for (NameAge string : map.keySet()) {
//				
//				System.out.print(string.getName()+"\t");
//				
//				System.out.print(string.getAge()+"\t");
//				
//				System.out.println(string.getCountry());
//				
//				pw.println(string.getName()+","+string.getAge()+","+string.getCountry());
//			}
				
			pw1.close();
		//	pw.close();
	//		inputfile.close();
			
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("cant find file");
			System.out.println(ex.getMessage());
			
		}
	}

}
