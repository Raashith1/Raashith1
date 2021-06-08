package oops1;



import java.util.LinkedList;
import java.util.List;

public class PrimeNumberInterval {
	public static void main(String[] args) {
		PrimeNumberInterval primes = new PrimeNumberInterval();
		primes.intervals();
		
		
	}
	
	public   void intervals() {
		// TODO Auto-generated method stub
		 int low=1, high=10000, i, flag;
		 List<Integer> prime = new LinkedList<>();
		 
		   
		  
		   System.out.printf("Prime numbers between %d and %d are: ", low, high);
		   System.out.println();

		   // iteration until low is not equal to high
		  for( low = 1;low<=high;low++) {
		      flag = 0;

		      // ignore numbers less than 2
		      if(low==1)
		    	  continue;
		      
              int lower=low / 2;
		      // if low is a non-prime number, flag will be 1
		      for (i = 2; i <= lower; ++i) {

		         if (low % i == 0) {
		            flag = 1;
		            break;
		         }
		      }

		      if (flag == 0)
		      prime.add(low);   

		      // to check prime for the next number
		      // increase low by 1
		      
		   }
		  for (Integer integer : prime) {
			  System.out.println(integer);
			  
		}
		  System.out.println();
        System.out.println(prime.size());
        
        
        for(int i1=0;i1<prime.size();i1++) {
			System.out.println("Element at location  " + i1 +"  is  "  +  prime.get(i1));
		}
		  
         
	}

	

}
