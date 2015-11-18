import java.util.ArrayList;


public class Tester {
	ArrayList<Vehicle> veh;
	
	public Tester(ArrayList<Vehicle> veh){
		this.veh = veh;
		for(int i=0; i<veh.size(); i++){
			//System.out.println(veh.get(i).getLicense());
			results(veh.get(i));
		}
		
	}

	public void results(Vehicle v){
		ArrayList<ParkingSpot> s = v.parkingSpots;
		for(int i =0; i<s.size(); i++){
			if(s.get(i).IsAvailable()!=null){
				System.out.println("level-" + s.get(i).getLevel() + ", row-" + s.get(i).getRow()+ ", spot"+s.get(i).getSpotNumber() + " is parked by "+v.getLicense() );
			}
		}
	}
	
}
