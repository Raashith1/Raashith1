package tryout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Addressmain {
	public static void main(String[] args) {
		
		List<String> addressList1 = new LinkedList<>();
		
		addressList1.add("100,Sunil street");
		addressList1.add("101,Sheik street");
		addressList1.add("300,Main Road");
		addressList1.add("500,Rajaji street");
		addressList1.add("400,K.K nagar");
		addressList1.add("700,R.K nagar");
		
		List<String> addressList2 = new LinkedList<>();
		
		addressList2.add("Thanjavur");
		addressList2.add("Chennai");
		addressList2.add("Ariyalur");
		addressList2.add("Trichy");
		addressList2.add("Coimbatore");
		addressList2.add("Kanyakumari");
		
		List<String> country = new LinkedList<>();
		country.add("India");
		country.add("Indonesia");
		country.add("Nepal");
		country.add("China");
		country.add("Srilanka");
		country.add("Australia");
		
		
		Random rand = new Random();
		
		   
		 //  Map<List<Integer>,List<String>> map = new HashMap<>();
		  
		   
		   
		   List<Address> addressList3 = new LinkedList<>();
		   for (int i = 0; i < 10000; i++) {

				Address address = new Address();
				String addressline1 = addressList1.get(rand.nextInt(addressList1.size()));
				address.setAddress1(addressline1);
				String addressline2 = addressList2.get(rand.nextInt(addressList2.size()));
				address.setAddress2(addressline2);
		//        String countries =  country.get(rand.nextInt(country.size()));
//		     address.setCountry(countries);
			     int Pincodes = rand.nextInt(600000);
			     address.setPincode(Pincodes);
			     
			     
			     if(Pincodes<=100000 ) {
			    	 address.setCountry(country.get(0));
			    	
			    	 
			     }
			     else if((Pincodes>100000 && Pincodes<=200000) ) {
			    	 address.setCountry(country.get(1));
			    	 
			     }
			     else if((Pincodes>200000 && Pincodes<=300000)) {
			    	 address.setCountry(country.get(2));
			    	 
			     }
			     else if((Pincodes>300000 && Pincodes<=400000) ) {
			    	 address.setCountry(country.get(3));
			    	 
			     }
			     else if((Pincodes>400000 && Pincodes<=500000)) {
			    	 address.setCountry(country.get(4));
			    	
			     }
			     else if((Pincodes>500000 && Pincodes<=600000)) {
			    	 address.setCountry(country.get(5));
			    	
			     }
			    
			     addressList3.add(address);
		     }
			
		   
		  
		
		   for (Address address : addressList3) {
			System.out.println(address.toString());
		}
		
		
//		for (List<Integer> map1: map.keySet()) {
//			System.out.println(map.get(map));
//		}
		
		
		
		
		
	}

}
