package Tasks;

public class Car extends Vechile {

	  // Constructor that calls parent constructor using super(type)
	Car(String type){
		super(type);

		System.out.println("Car Created with type --" + type);
	}

	// No-argument constructor that calls the above constructor using this("Car")
	Car(){
		this("Car");  // calls Car(String type)
		System.out.println("Default Car Constructor");
	}

}
