package assignment44;

import java.util.ArrayList;

//constructs the 3 floors
public class Floors {

	private ArrayList<Floor> floors;
	
	public Floors() {
		this.floors = new ArrayList<Floor>();
		Floor floor1 = new Floor("Floor 1", 1);
		Floor floor2 = new Floor("Floor 2", 2);
		Floor floor3 = new Floor("Floor 3", 3);
		floors.add(floor1);
		floors.add(floor2);
		floors.add(floor3);
	}
	public Floor getFloorLevel(int num) {
		return floors.get(num);
	}
}
