
public class Car extends Vehicle {

	
	public Car(String license) {
		spotsNeeded = 1;
		size = VehicleSize.Medium;
		licensePlate = license;
		 }
	
	
	
	
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

}
