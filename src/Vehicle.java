import java.util.ArrayList;


public abstract class Vehicle {

	protected  ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
			
protected  String licensePlate;
			
protected int spotsNeeded;
			
protected VehicleSize size;
protected  Level l ;
			
		
public int getSpotsNeeded() { 
	return spotsNeeded; 
	}

public VehicleSize getSize(){ 
	return size; 
	}


public Level getlevel(){
	return l;
}

public String getLicense(){
	return licensePlate;
}

public void parkInSpot(ParkingSpot s) { 
	parkingSpots.add(s); 
	}

/* Remove car from spot, and notify spot that it's gone */
public void clearSpots() { 
	parkingSpots = null;
	
	
}
/* Checks if the spot is big enough for the vehicle (and is
* available). This compares the SIZE only. It does not check if
* has enough spots. */


public abstract boolean canFitInSpot(ParkingSpot spot);


	
	
}
