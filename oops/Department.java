package oops;

public class Department {

	private int No_of_Students;
	
	private Student CSE;
	private Student EEE;
	private Student CIVIL;
	
	
	
	public Teacher cse;
	public Teacher eee;
	public Teacher civil;
	
	
	
	
	public Teacher getCse() {
		return cse;
	}
	public void setCse(Teacher cse) {
		this.cse = cse;
	}
	public Teacher getEee() {
		return eee;
	}
	public void setEee(Teacher eee) {
		this.eee = eee;
	}
	public Teacher getCivil() {
		return civil;
	}
	public void setCivil(Teacher civil) {
		this.civil = civil;
	}
	public int getNo_of_Students() {
		return No_of_Students;
	}
	public void setNo_of_Students(int no_of_Students) {
		No_of_Students = no_of_Students;
	}
	public Student getCSE() {
		return CSE;
	}
	public void setCSE(Student cSE) {
		CSE = cSE;
	}
	public Student getEEE() {
		return EEE;
	}
	public void setEEE(Student eEE) {
		EEE = eEE;
	}
	public Student getCIVIL() {
		return CIVIL;
	}
	public void setCIVIL(Student cIVIL) {
		CIVIL = cIVIL;
	}
	@Override
	public String toString() {
		return "Department [No_of_Students=" + No_of_Students + ", CSE=" + CSE + ", EEE=" + EEE + ", CIVIL=" + CIVIL
				+ ", cse=" + cse + ", eee=" + eee + ", civil=" + civil + "]";
	}
	
	
	
	
	
}
