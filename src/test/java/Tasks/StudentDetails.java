package Tasks;

public class StudentDetails extends Student {

	String name;
	int rollno;

	StudentDetails(String name){
		super(name);
		System.out.println("Arun Kumar");

	}
	StudentDetails(int rollno){
		super(rollno);
		System.out.println("1213");
	}

	public void StudentDetals(){
		System.out.println("Invalid Details");


	}
}
