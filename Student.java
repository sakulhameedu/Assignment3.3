public class Student {
	
	String name;
	int id;
	String address;

//Creating the constructor which as same as the class name 
public Student(String name, int id, String address){
	
	this.name = name;
	this.id = id;
	this.address = address;
}
//Creating the method named instance method
public int result(int physics, int chemistry, int maths){
	
	int result = physics+chemistry+maths;
	return result;
}

}
