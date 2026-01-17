package ControlStatements;

public class DayBasedSwitchStatement {
	public static void main(String[] args) {


	int day = 7;

	switch (day) {
	    case 1:
	        System.out.println("Monday – Team meeting");
	        break;
	    case 2:
	        System.out.println("Tuesday – Development work");
	        break;
	    case 3:
	        System.out.println("Wednesday – Testing");
	        break;
	    case 4:
	        System.out.println("Thursday – Review");
	        break;
	    case 5:
	        System.out.println("Friday – Deployment");
	        break;
	    case 6:
	    	System.out.println("Saturday Weekend - Holiday");
	    	break;
	    case 7:
	        System.out.println("Sunday Weekend – Holiday");
	        break;
	        default:
	        	System.out.println("Invalid Input");
	}

	}
}
