package assignment44;

import java.util.ArrayList;

public class FloorFactory {
	
	private int numOfFloors;
	private ArrayList<ElevatorButton> buttons;
	private ArrayList<Floor> floors;
	//make floors and buttons dynamically
	public FloorFactory(int numOfFloors) {
		buttons = new ArrayList<ElevatorButton>();
		floors = new ArrayList<Floor>();
		this.numOfFloors = numOfFloors;
		makeFloorMap();
	}
	//dynamically create buttons and floors
	private void makeFloorMap() {
		for(int i = 1; i <= numOfFloors; i++) {
			Floor floor = new Floor("Floor "+Integer.toString(i),i);
			ElevatorButton button = new ElevatorButton(i);
			floors.add(floor);
			buttons.add(button);
		}
	}
	public ElevatorButton getButton(int buttonNum) {
		return buttons.get(buttonNum);
	}
	public Floor getFloor(int floorNum) {
		return floors.get(floorNum);
	}

}
