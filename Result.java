public class Result {

	public static void main(String[] args) {
	
		System.out.println("First Student details");
	
		Student student1 = new Student("Arpit", 101, "Mumbai");	//Creating the object of student1
		String nm = student1.name;
		System.out.println("Name : "+nm);
		
		int ID = student1.id;
		System.out.println("Id : "+ID);
		
		String add = student1.address;
		System.out.println("Address : "+add);

		int res = student1.result(60, 80, 70);
		System.out.println("The result of "+nm+ " in Physics Chemistry and Maths is "+res+" out of 300 marks");
		System.out.println("---------------------------------------------------------------------------------");
		
		
		System.out.println("Second Student details");
		Student student2 = new Student("Deepak", 102, "Pune"); //Creating the object of student2
		nm = student2.name;
		System.out.println("Name : "+nm);
		
		ID = student2.id;
		System.out.println("Id : "+ID);
		
		add = student2.address;
		System.out.println("Address : "+add);

		res = student2.result(80, 90, 70);
		System.out.println("The result of "+nm+ " in Physics Chemistry and Maths is "+res+" out of 300 marks");
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("Third Student details");
		Student student3 = new Student("Sarthak", 103, "Delhi"); //Creating the object of student3
		nm = student3.name;
		System.out.println("Name : "+nm);
		
		ID = student3.id;
		System.out.println("Id : "+ID);
		
		add = student3.address;
		System.out.println("Address : "+add);

		res = student3.result(90, 75, 69);
		System.out.println("The result of "+nm+ " in Physics Chemistry and Maths is "+res+" out of 300 marks");
	}

}
