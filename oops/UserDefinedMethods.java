package oops;

public class UserDefinedMethods {
	public static void main(String[] args) {
		getName();
		getNum(90);
		
		
		int result=giveNum();
		System.out.println(result);
		
		System.out.println("the addition of two numbers are "+addThese(500,100));
		
		System.out.println("the addition is "+addition(5,"12"));
		
		System.out.println();
		countDown(100);
		
		
		
		
		UserDefinedMethods users = new UserDefinedMethods();
		System.out.println(users.subtract(10,5));
	}
	
	// void,no parameter
	public static void getName() {
		System.out.println("Hello");
	}
	//void parameterized
	
	public static void getNum(int n) {
		System.out.println("the number is "+n);
		
	}
	
	//int no parameter
	public static int giveNum() {
		return 100;
	}
	
	
	//int parameterized
	public static int addThese(int num1,int num2) {
		return num1+num2;
	}
	
	public static int addition(int value,String str) {
		return value+Integer.parseInt(str);
	}
	
	public static void countDown(int n) {
		if(n>=0) {
			System.out.println(n);
			countDown(n-1);
		}
	}
	
	public int subtract(int num,int num2) {
		int value = getvalue();
		return value-num2;
	}

	public int getvalue() {
		return 100;
	}
}
