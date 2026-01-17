package Tasks;

public class VCar extends Vechile {
	
	VCar(String type){
		super(type);
		System.out.println("Car Created with type" + type);
	}
	VCar(){
		this("VCar");
		System.out.println("Default Car Constructor");
	}

}
