package Tasks;

import java.util.Scanner;

public class ReverseNumberUsingWhileLoop {

	public static void main(String[] args) {

	int number, reverse=0;

	Scanner scr=new Scanner(System.in);

	System.out.println("enter your number");
	number=scr.nextInt();

	while(number !=0) {
		int digit = number % 10;
		reverse = reverse * 10 + digit;
		number= number/10;
		}

	System.out.println("Reversed number is "+ reverse);
	scr.close();




	}
}
