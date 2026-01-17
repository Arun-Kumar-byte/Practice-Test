package ControlStatements;

public class NestedIfStatement {
	public static void main(String[] args) {
	//	float f=1.23f;

		double score= 70.50;
	boolean	attendedexam= true;

		if(attendedexam) {
			if(score>=80) {
				System.out.println("Scored with Grade A");
			}
			else {
				System.out.println("You Passed the Exam");
			}
		}else {
				System.out.println("You didn't attended the exam");
			}
		}
}
