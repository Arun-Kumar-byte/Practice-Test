package ControlStatements;

public class RoleBasedSwictStatement {
	public static void main(String[] args) {
		String Role = "BA";

		switch(Role) {
		case "Admin":
			System.out.println("User with Full Access");
			break;
		case "Manager":
			System.out.println("User with Limited Access");
			break;
		case "Tester":
			System.out.println("user with Read only Access");
			break;
		case "BA":
			System.out.println("NO Access");
			break;
		default:
			System.out.println("Invalid Input from User");
		}

	}

}
