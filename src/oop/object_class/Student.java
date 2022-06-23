package oop.object_class;

//Defining a student class
public class Student {

	//defining fields
	int id;//fiels or data member or instance variable;
	String name;
	//creating main method inside the student class
	public static void main(String args[]) {
		//creating an object or instance
		Student s1 = new Student();//creating an object of student
		//Printing values of the object
		System.out.println(s1.id);//accessing member through reference variable
		System.out.println(s1.name);
	}
	
}
