
public class Level {
	private static int NUM_Rows = 3;
	public int floor;
	
	
	private static final int SPOTS_PER_ROW = 30;
	public static ParkingSpot[] spots = new ParkingSpot[SPOTS_PER_ROW*NUM_Rows];
	private  int availableSpots = SPOTS_PER_ROW*NUM_Rows; // number of free spots
	
	public Level(int f) { 
		
		floor = f;
		
		for(int i=1; i<=NUM_Rows; i++){
			if(i==1){
			for(int j=0; j<SPOTS_PER_ROW; j++){
				spots[j]= new ParkingSpot(floor,i,j,VehicleSize.Small);
				spots[j].vehicle = null;
	         
				}
			}
			
			else if(i==2){
				for(int j=30; j<SPOTS_PER_ROW +30; j++){
					spots[j]= new ParkingSpot(floor,i,j,VehicleSize.Medium);
					spots[j].vehicle = null;
			}
			
			}
			else{
				
				for(int j=60; j<SPOTS_PER_ROW +60; j++){
					spots[j]= new ParkingSpot(floor,i,j,VehicleSize.Large);
					spots[j].vehicle = null;
			}
				
				
			}
				
			}
		}
		
		
	
	
	public int availableSpots() { return availableSpots; }
	
	/* Find a place to park this vehicle. Return false if failed. */
	public boolean parkVehicle(Vehicle vehicle) {
		
		int g = findAvailableSpots(vehicle);
		if(g!=0){
			return parkStartingAtSpot(g,vehicle);
		}
		return false;
		
	}
	/* Park a vehicle starting at the spot spotNumber., and
	* continuing until vehicle.spotsNeeded. */
	private boolean parkStartingAtSpot(int num, Vehicle v) {
		for(int h=1;h<=v.getSpotsNeeded();h++){
			v.parkInSpot(spots[num]);
		spots[num].park(v);
		availableSpots--;
		num++;
		}
		
		return true; 
		
	}
	
	private boolean spotChecker(int n){
		int c=0;
		for(int y=0;y<5; y++){
			if(spots[n+y].IsAvailable()==null){
				c+=1;
			}
		}
		if(c==5){
			return true;
		}
		return false;
	}
	
	private int findAvailableSpots(Vehicle vehicle) {
		
		for(int k=0; k<spots.length; k++){
			
			//System.out.println(spots[k].getSpotNumber());
			
			if(spots[k].canFitVehicle(vehicle)){
				if(((vehicle.getSpotsNeeded()==5) && spotChecker(k))||vehicle.getSpotsNeeded()!=5){
					//System.out.println(k);
					return k;
				}
				
				}
				
			}
		
				return 0;
				
			}
		
		  
	/* When a car was removed from the spot, increment
	* availableSpots */
	public void spotFreed(ParkingSpot s ) { 
		s.removeVehicle();
		availableSpots++; }
	
	
}

