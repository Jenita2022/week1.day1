package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 1;
	long chasisNumber = 12345678901234567L;
	boolean isPunctured = false;
	String bikeName = "YAMAHA";
	double runningKm = 12500.567;
			
public static void main(String[] args) {
	
	TwoWheeler vehicle = new TwoWheeler();
	
	System.out.println("Wheels : " +vehicle.noOfWheels);
	System.out.println("Mirrors : " +vehicle.noOfMirrors);
	System.out.println("Chasis No : " +vehicle.chasisNumber);
	System.out.println("Punctured : " +vehicle.isPunctured);
	System.out.println("Bike Name : " +vehicle.bikeName);
	System.out.println("Distance Covered : " +vehicle.runningKm);
	}

}
