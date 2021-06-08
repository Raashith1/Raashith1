package oops;

public class Teacher {
	private String name;
	private String qualification;
	
	private  Department department;
	
	

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", qualification=" + qualification + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

	

}
