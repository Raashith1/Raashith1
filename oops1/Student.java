package oops1;




public class Student {
    
	
	 String FirstName;
	 String LastName;
	 int Rollno;
	 
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	

	



	

	
}
