package assignment44;

import java.util.ArrayList;

public class ElevatorMediator implements Mediator{
	
	DoorWidget doors;
	ArrayList<Colleague> floors;
	
	public ElevatorMediator() {
		doors = new DoorWidget();
		floors = new ArrayList<Colleague>();
	}
	
	public Floor pressButton(int buttonID, Floor current) {
		if(doors.getDoorState() == true) {
			doors.closeDoors();
		}
		if(buttonID == current.getPosition()) {
			floors.get(buttonID).nothing();
		}
		else if(buttonID > current.getPosition()) {
			
			floors.get(buttonID).goingUp();
			floors.get(buttonID).arrive();	
			doors.openDoors();
		}
		else if(buttonID < current.getPosition()) {
			floors.get(buttonID).goingDown();
			floors.get(buttonID).arrive();	
			doors.openDoors();
		}
		return (Floor) floors.get(buttonID);
	}

	//add a floor
	public void addFloor(Floor f) {
		floors.add(f);
	}


}