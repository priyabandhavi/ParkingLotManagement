
public class Motorcycle extends Vehicle{

	
	public Motorcycle(String license) {
    spotsNeeded = 1;
  size = VehicleSize.Small;
  licensePlate = license;
		}
	
	
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		
	return false;
	}

}
