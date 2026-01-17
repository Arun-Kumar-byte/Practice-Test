package Variables;

public class demotest {

	String Cricketer;
	int total_centuries;

	demotest(String x, int y){
		Cricketer = x;
		total_centuries = y;
	}




	public static void main(String[] args) {

		demotest obj = new demotest("Sachine", 100);
		System.out.println(obj.Cricketer);
		System.out.println(obj.total_centuries);


		demotest obj1 = new demotest("Kohli", 98);
		System.out.println(obj.Cricketer);
		System.out.println(obj.total_centuries);


	}

}
