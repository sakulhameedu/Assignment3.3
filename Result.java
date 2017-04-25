public class Result {

public static void main(String[] args) {
System.out.println("First Student details");
Student student1 = new Student("Arpit", 101, "Mumbai"); //Creating the object of student1
String nm1 = student1.name;
System.out.println("Name : "+nm1);
int ID = student1.id;
System.out.println("Id : "+ID);
String add = student1.address;
System.out.println("Address : "+add);

int res1 = student1.result(90, 80, 90);
System.out.println("The result of "+nm1+ " in Physics Chemistry and Maths is "+res1+" out of 300 marks");
System.out.println("---------------------------------------------------------------------------------");
System.out.println("Second Student details");
Student student2 = new Student("Deepak", 102, "Pune"); //Creating the object of student2
String nm2 = student2.name;
System.out.println("Name : "+nm2);
ID = student2.id;
System.out.println("Id : "+ID);
add = student2.address;
System.out.println("Address : "+add);

int res2 = student2.result(80, 80, 70);
System.out.println("The result of "+nm2+ " in Physics Chemistry and Maths is "+res2+" out of 300 marks");
System.out.println("---------------------------------------------------------------------------------");
System.out.println("Third Student details");
Student student3 = new Student("Sarthak", 103, "Delhi"); //Creating the object of student3
String nm3 = student3.name;
System.out.println("Name : "+nm3);
ID = student3.id;
System.out.println("Id : "+ID);
add = student3.address;
System.out.println("Address : "+add);

int res3 = student3.result(90, 75, 69);
System.out.println("The result of "+nm3+ " in Physics Chemistry and Maths is "+res3+" out of 300 marks");
   System.out.println("---------------------------------------------------------------------------------");
   System.out.println("---------------------Ranking Order-----------------------");
 if ((res1 > res2) || (res1 > res3)) 
 {
  System.out.println("Rank 1 was taken by:"+nm1);
 }
 else if ((res2 > res3) || (res2 > res1))
 {																					//ranking all three students
     System.out.println("Rank 1 was taken by:"+nm2);
 }
 else 
 {System.out.println("Rank 1 was taken by:"+nm3);
 }
 
 
 if ((res2 > res3) || (res2 > res1)) 
 {
  System.out.println("Rank 2 was taken by:"+nm2);
 }
 else if ((res3 > res1) || (res3 > res2))
 {
     System.out.println("Rank 2 was taken by:"+nm3);
 }
 
 if ((res1 < res2) || (res1 < res3)) 
 {
  System.out.println("Rank 3 was taken by:"+nm1);
 }
 else if (res2 < res3)
 {
     System.out.println("Rank 3 was taken by:"+nm2);
 }
 else 
 {System.out.println("Rank 3 was taken by:"+nm3);
 }
 
 

}
}
