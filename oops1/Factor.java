package oops1;

import java.util.LinkedList;
import java.util.List;

public class Factor {
	
	
	
	public List<Integer> getfactor(int element) {
		List<Integer> factors = new LinkedList<>();
		int i=1,flag;
		while(i<=element) {
			if(element%i==0)
			{
				factors.add(i);
			}
		i++;
		}
		return factors;
	}
}
