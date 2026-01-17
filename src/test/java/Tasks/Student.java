package Tasks;

public class Student {
	 String name;
	 int rollno;


	 Student(String name){
		 this.name = name;
		 System.out.println("Name of the Student is --" + name);
	 }

	 Student(int rollno){
		 this.rollno = rollno;
		 System.out.println("Roll No. of the Student is --" + rollno);
	 }

}
