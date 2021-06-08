package oops1;

import java.util.List;
import java.util.LinkedList;

public class Teacher {
	String FirstName;
	String LastName;
	String EmployeeId;

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	@Override
	public String toString() {
		return "TeacherList [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmployeeId == null) ? 0 : EmployeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (EmployeeId == null) {
			if (other.EmployeeId != null)
				return false;
		} else if (!EmployeeId.equals(other.EmployeeId))
			return false;
		return true;
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
