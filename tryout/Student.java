package tryout;

public class Student {
	private String Firstname;
	private String Lastname;
	@Override
	public String toString() {
		return "Student [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}

}
