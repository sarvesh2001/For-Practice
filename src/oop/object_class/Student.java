package oop.object_class;

//Defining a student class
public class Student {

	//defining fields
	private int id;//fiels or data member or instance variable;
	private String name;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	//creating main method inside the student class
	public static void main(String args[]) {
		//creating an object or instance
		Student s1 = new Student();//creating an object of student
		s1.setId(1);s1.SetName("Hello-world-I-am-secure");
		System.out.println("ID : "+s1.getId());
		System.out.println("Name : "+s1.getName());
	}
	
}
