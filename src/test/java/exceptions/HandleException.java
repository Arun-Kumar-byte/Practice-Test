package exceptions;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Program Starts...");
		System.out.println("Enter Number");
		int num= sc.nextInt();
		
		try{
			System.out.println(100/num);
		}catch(ArithmeticException e) {
			System.out.println("invalid data...");
			System.out.println(e.getMessage());
		}
	System.out.println("Program ends...");
	}

}
