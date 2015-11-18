
public class ParkingSpot {
	public   Vehicle vehicle = null;
	public VehicleSize spotSize;
	public int row;
	public int spotNumber;
	public int level = 0;
	
	
	public ParkingSpot(int l, int r, int n, VehicleSize s) {
		level = l;
		row = r;
		spotNumber = n;
		spotSize = s;
		
	}
	
	public Vehicle IsAvailable() { 
		return vehicle; }
	
	
	/* Check if the spot is big enough and is available */
	public boolean canFitVehicle(Vehicle vehicle) {
		if((IsAvailable()==null) && vehicle.getSize().equals(spotSize)){
			return true;
		}
		return false; 
	}
	
	/* Park vehicle in this spot. */
	public boolean park(Vehicle v) {
		vehicle = v;
		return true; 
		
	}
	public int getRow() { 
		return row;
		}
	
	public int getLevel(){
		return level;
	}
	
	public int getSpotNumber() { 
		return spotNumber; }
	/* Remove vehicle from spot, and notify level that a new spot is
	* available */
	
	
	public void removeVehicle() { 
		vehicle = null;
	}
	
	}
