package arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int[] a= {100,20,30,40,50,60,72,85,10,4,5,27,88,90,99};
	//	int max[]= {1,20,30,40,50,60,72,85,10,4,5,27,88,90,99};
		
		int minimum=a[0];
		for(int i=1;i>=a.length; i++) {
			if(a[i]<minimum) {
				minimum=a[i];
				
			}
		} 
		System.out.println("The minium value is  "+ minimum);
		
		
	}

}
