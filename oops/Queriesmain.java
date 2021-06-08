package oops;

public class Queriesmain {
public static void main(String[] args) {
	Queries query = new Queries();
	
	query.setTablename("Student");
	query.setId(100);
	query.setFname("Raj");
	query.setLname("Kumar");
	query.setPass("163883928928");
	
	
	
	
	System.out.println("Insert values in the table");
	
	
//	INSERT INTO table_name
//	VALUES (value1, value2, value3, ...);
	System.out.println("INSERT INTO "+query.getTablename()+" values ("+query.getId()+","+query.getFname()+","+query.getLname()+","+query.getPass()+");");
	//SELECT * FROM table_name;
	System.out.println();
	System.out.println("Retrieve all the columns in the table");
	System.out.println("Select * from "+query.getTablename());
	System.out.println();
	//SELECT column1, column2, ...
	//FROM table_name;
	
	System.out.println("Retrieve firstname column from the table ");
	System.out.println("Select Firstname from "+query.getTablename());
	
	System.out.println();
	System.out.println("Retrieve lastname column from the table ");
	System.out.println("Select Lastname from "+query.getTablename());
	
	System.out.println();
	System.out.println("Retrieve id column from the table ");
	System.out.println("Select Id from "+query.getTablename());
	
	System.out.println();
	System.out.println("Retrieve password column from the table ");
	System.out.println("Select password from "+query.getTablename());
	
//	UPDATE table_name
//	SET column1 = value1, column2 = value2, ...
//	WHERE condition;
Queries query1 = new Queries();
	
	
	query1.setId(100);
	query1.setFname("Ram");
	query1.setLname("Kumar");
	query1.setPass("16388392909");
	System.out.println();
	System.out.println("Update values from the table");
	System.out.println("Update "+query.getTablename()+" set Fname = "+query1.getFname()+" from "+query.getTablename());
	
	
	
	
}
}
