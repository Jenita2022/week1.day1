package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	
	public void applyGear() {
		System.out.println("Apply Gear");
	}

	public void switchOnAC() {
		System.out.println("Switch On AC");
	}
	
	public void applyAccelerate() {
		System.out.println("Apply Accelerate");
	}
	
public static void main(String[] args) {
	System.out.println("Fuctions of Car");
		Car act = new Car();
		
		act.applyBreak();
		act.applyGear();
		act.applyAccelerate();
		act.switchOnAC();
		
	}

}
