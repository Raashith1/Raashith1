package oops1;

public class DoWhile {
	public static void main(String[] args) {
		int count=1;
		while(count<10){
			
			if(count==5) {
				count++;
				break;
			}
			System.out.println(count);
			count++;
		}
		
		
//		for(count=1;count<10;count++) {
//			System.out.println(count);
//		}
		
	}

}
