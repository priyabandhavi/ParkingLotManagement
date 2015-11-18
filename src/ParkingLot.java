
public class ParkingLot {
	private Level[] levels;
	private  int NUM_LEVELS ;
	
	public ParkingLot(int n){ 
		NUM_LEVELS = n;
		levels = new Level[NUM_LEVELS];
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		Vehicle v = vehicle;

		for(int i=0; i<NUM_LEVELS;){
			levels[i]=new Level(i);
			
			if(levels[i].availableSpots()>0){
				if(levels[i].parkVehicle(v)){
					v.l = levels[i];
					return true;
					}
				else{
					i++;
				}
				
			}
}
		return false;
	}
	
	public void removeVehicle(Vehicle vehicle){
		Vehicle v = vehicle;
		for(int j=1; j<=v.parkingSpots.size(); j++){
			v.getlevel().spotFreed(v.parkingSpots.get(j));
			
		}
		
	}
	
	
	
	
	}
	

