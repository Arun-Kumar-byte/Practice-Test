package Variables;

public class StaticVariable {
//global variable
	static String geek = "Sweta Dash";

    public static void main(String[] args)
    {
        // Access static variable without creating an object
        System.out.println("Geek Name is: " + StaticVariable.geek);

        // static int c = 0;
        // Error: static variables cannot be declared inside a method
    }
}

