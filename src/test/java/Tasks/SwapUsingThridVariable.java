package Tasks;

import java.util.Scanner;

public class SwapUsingThridVariable {
	public static void main (String[]args) {
		int a, b, temp;
		Scanner scr = new Scanner(System.in);

		 // Input values
		System.out.println("Enter First Number");
		a= scr.nextInt();
		System.out.println("Enter Second Number");
		b= scr.nextInt();

		 // Swapping using third variable
		temp =a;
		a=b;
		b=temp;

		// Output after swapping

		System.out.println("After Swapping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		scr.close();

	}

}
