package Tasks;

import java.util.Scanner;

public class SwapUsingArray {
	public static void main(String[] args) {
		int[] arr = new int[2];

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter First Number");
		arr[0]= scr.nextInt();

		System.out.println("Enter Second Number");
		arr[1]= scr.nextInt();

		arr[0]= arr[0]+arr[1];
		arr[1]= arr[0]-arr[1];
		arr[0]= arr[0]-arr[1];

		System.out.println("First Number is ="+ arr[0]);
		System.out.println("Second Number is ="+ arr[1]);
		scr.close();

	}
}
