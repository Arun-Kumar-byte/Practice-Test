package Tasks;

import java.util.Scanner;

public class SwapWthoutUsingThirdVariable {
	public static void main(String[] args) {


	int a , b;

	Scanner scr = new Scanner(System.in);

	System.out.println("Enter First Number");
	a= scr.nextInt();

	System.out.println("Enter Second Number");
	b= scr.nextInt();

	//Before Swapping
	System.out.println("a="+a+"::b="+b);

	//Swapping without using third variable

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("After Swapping");
	System.out.println("a =::" + a);
	System.out.println("b=::" + b);
	scr.close();











	}
}
