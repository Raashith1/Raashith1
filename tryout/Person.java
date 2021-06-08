package tryout;

public class Person {
	private String name;
	private String district;
	private String age; 
//	public Person(String name, String city, String age) {
//		this.name = name;
//		this.district = city; 
//		this.age = age;
//		} 
	
	
	public String getName() { 
		return name;
		}
	@Override
	public String toString() {
		return "Person [name=" + name + ", district=" + district + ", age=" + age + "]";
	}
	public void setName(String name)
	{ 
		this.name = name; 
		}
	public String getDistrict()
	{ 
		return district;
		}
	public void setDistrict(String district)
	{ 
		this.district = district; }
	public String getAge() 
	{ 
		return age; } 
	public void setAge(String age) 
	{ 
		this.age = age; }
	


}
