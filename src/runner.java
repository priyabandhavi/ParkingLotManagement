import java.util.ArrayList;


public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> veh = new ArrayList<>();
		
ParkingLot p = new ParkingLot(15);

Vehicle v = new Bus("AP7067");
veh.add(v);
p.parkVehicle(v);

Vehicle v1 = new Car("AP567");
veh.add(v1);
p.parkVehicle(v1);

Vehicle  v2 = new Motorcycle("AP444");
veh.add(v2);
p.parkVehicle(v2);



/*Vehicle  v3 = new Motorcycle("AP4488");
veh.add(v3);
p.parkVehicle(v3);*/


Tester t = new Tester(veh);



	}

}
