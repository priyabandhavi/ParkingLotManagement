
public class Bus extends Vehicle {

	public Bus(String license) {
		
		spotsNeeded = 5;
		
		size = VehicleSize.Large;
		licensePlate = license;
		}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		
		return false;
	}
	
}
