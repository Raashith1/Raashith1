package oops;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("John Baugh",5000);
		BankAccount bobsAccount = new BankAccount("Bob hilson");
		
		bobsAccount.deposit(500);
		System.out.println("owner is "+bobsAccount.getOwner());
		System.out.println("balance is "+bobsAccount.getBalance());
		
		bobsAccount.withdraw(1000);
		System.out.println("owner is "+bobsAccount.getOwner());
		System.out.println("balance is "+bobsAccount.getBalance());
		System.out.println();
		
		System.out.println("owner is "+myAccount.getOwner());
		System.out.println("balance is "+myAccount.getBalance());
		System.out.println();
		System.out.println("deposit 1000?");
		
		myAccount.deposit(1000);
		System.out.println("owner is "+myAccount.getOwner());
		System.out.println("balance is "+myAccount.getBalance());
		
		
		
		
		
		
	}

}
