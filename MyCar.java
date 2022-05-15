package week1.day1;

public class MyCar {
	
	public static void main(String[] args) {
		System.out.println("Calling Methods of another (Car) Class");
		System.out.println("Functios of my Car");
		
		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.applyAccelerate();
		obj.switchOnAC();

	}

}
