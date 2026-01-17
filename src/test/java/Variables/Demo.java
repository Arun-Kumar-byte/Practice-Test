package Variables;

public class Demo {


	//Method with Arguments & Return Type

	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	//Method with Arguments & No return type

	public void sub(int e, int f) {
		int g = e - f;
		System.out.println(g);
	}

	//





	public static void main(String[] args) {

		Demo obj = new Demo();
		System.out.println(obj.add(10, 10));

	}

}
