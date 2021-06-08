package oops;

public class Departmentservice {
	
	public void assignCse(Department department, Student student) {
		department.setCSE(student);
	}

	public void assignEee(Department department, Student student) {
		department.setEEE(student);
	}
	public void assignCivil(Department department, Student student) {
		department.setCIVIL(student);
	}
	public void assignCse(Department department, Teacher teacher) {
		department.setCse(teacher);
	}

	public void assignEee(Department department, Teacher teacher) {
		department.setEee(teacher);
	}
	public void assignCivil(Department department, Teacher teacher) {
		department.setCivil(teacher);
	}
	

}
