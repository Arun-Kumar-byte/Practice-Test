package ControlStatements;

import java.util.Scanner;

public class SwitchStatement {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("1. Deposit");
	System.out.println("2. Select Cash Withdrawl");
	System.out.println("3. Balance Enquiry");
	System.out.println("4. Exit");
	System.out.println("5. Invaild Input");

	System.out.println("Enter Your Input");

	int choice = sc.nextInt();

	switch(choice) {
	case 1:
		System.out.println("your account balance is 50,000 rupees");
		break;
	case 2:
		System.out.println("Cash Depost");
		break;
	case 3:
		System.out.println("Cancel Transaction");
		break;

	case 4:
		System.out.println("Cash withdrawl selected");
		break;
	case 5:
		System.out.println("Thanks for Using ATM");
		break;
		default :
			System.out.println("Invalid Input");
	}


}

}
