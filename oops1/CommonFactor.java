package oops1;

public class CommonFactor {

	public int getLcm(int input1, int input2) {
		int hcf = getHcf(input1,input2);

		
		int lcm = (input1 * input2) / hcf;
		
		return lcm;
		
	}
	
public int getHcf(int input1, int input2) {
		
		int hcf = 1;
		for (int i = 1; i <= input1 && i <= input2; i++) {
			if (input1 % i == 0 && input2 % i == 0) {
				hcf = i;

			}

		}

		return hcf;
		
	}

	
}
