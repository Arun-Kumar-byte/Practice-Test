package Tasks;

public class SwapUsingXOROperator {
	public static void main(String[] args) {
		int a=10, b=20;

	/*  int a,b;
	 *
	 * Scanner scr= new Scanner(System.in);
	 *
	 * System.out.println("Enter First Number");
	 * a=scr.nextInt();
	 * System.out.println("Enter Second Number);
	 * b=scr.nextInt();
	 *
	 */

		System.out.println("Before Swapping value of a="+a+" and b="+b);

		//XOR (^) has the property that x ^ x = 0 and x ^ 0 = x.

		//a = a ^ b

		//b = a ^ b → gives original value of a

		//a = a ^ b → gives original value of b

		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
