package oops;

public class Mainmethod {
public static void main(String[] args) {
	 
	 
	 Student student1 = new Student();
	 student1.setName("Ram");
	 student1.setAge(18);
	 
	 Student student2 = new Student();
	 student2.setName("Rakesh");
	 student2.setAge(18);
	 
	 Student student3 = new Student();
	 student3.setName("Raja");
	 student3.setAge(18);
	 
	 Teacher teacher1 = new Teacher();
	 teacher1.setName("ravi");
	 teacher1.setQualification("M.E");
	 
	 Teacher teacher2 = new Teacher();
	 teacher2.setName("Ramesh");
	 teacher2.setQualification("M.E");
	 
	 Teacher teacher3 = new Teacher();
	 teacher3.setName("Rajesh");
	 teacher3.setQualification("M.E");
	 
	 
	 Department department1 = new Department();
	 department1.setNo_of_Students(5);
	 department1.setCIVIL(student1);
	 department1.setCivil(teacher1);
	 
	 Department department2 = new Department();
	 department2.setNo_of_Students(5);
	 department2.setCSE(student2);
	 department2.setCse(teacher2);
	 
	 Department department3 = new Department();
	 department3.setNo_of_Students(5);
	 department3.setEEE(student3);
	 department3.setEee(teacher3);
	 
	 
	  Studentservice studentservice = new Studentservice();
	  studentservice.assignDept(student1, department1);
	  studentservice.assignDept(student2, department2);
	  studentservice.assignDept(student3, department3);
	  
	  Teacherservice teacherservice = new Teacherservice();
	  teacherservice.assignDept(teacher1, department1);
	  teacherservice.assignDept(teacher2, department2);
	  teacherservice.assignDept(teacher3, department3);
	  
	  Departmentservice departmentservice = new Departmentservice();
	  departmentservice.assignCivil(department1, student1);
	  departmentservice.assignCse(department2, student2);
	  departmentservice.assignEee(department3, student3);
	  
	  System.out.println(student1.toString());
	  System.out.println(student2.toString());
	  System.out.println(student3.toString());
	  
	  System.out.println(teacher1.toString());
	  System.out.println(teacher2.toString());
	  System.out.println(department1.toString());
	  System.out.println(department2.toString());
	  System.out.println(department3.toString());
	 
}
}
