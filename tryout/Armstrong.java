package tryout;

public class Armstrong {
	public static void main(String args[]) {
		Armstrong a = new Armstrong();

		for (int i = 100; i < 1000; i++) {
			a.verifyarmstrong(i);
			if(a.verifyarmstrong(i)==true)
			System.out.println(i);
			
		}
	}

	public boolean verifyarmstrong(int n) {
		int result = 0, rem, temp;
		// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			result = result + (rem * rem * rem);
		}
		if (temp == result)
			return true;
		else
			return false;
	}
}
