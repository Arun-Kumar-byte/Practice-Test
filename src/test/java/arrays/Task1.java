package arrays;

public class Task1 {

	public static void main(String[] args) {
	
		//WAP to Print even numbers using array
		
		int arr[]= {10,15,20,25,30,35};
		
		for(int num:arr) {
			
			if(num%2==0) {
				
				System.out.println("Even numbers in an array is ::" + num);
			}
			}
		
		//WAP to Print odd numbers using array
		System.out.println(" ");
		for (int num:arr) {
			if(num%2!=0) {
				System.out.println("Odd Numbers in an array is " + num);
			}
		}
		//Wap to count the even and odd numbers in array ?

		int evencount = 0;
		int oddcount =0;
		for(int num:arr ) {
			if(num%2==0){
				System.out.println("Even Count is  " + evencount);
			}else{
				System.out.println("Odd Count is  "+ oddcount);
				
			}
		}
	}
}
