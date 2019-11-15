package assignment44;

public class DoorClosed implements DoorState{
	@Override
	public void doorStatus(DoorStateContext door) {
		System.out.println("Doors are closed.");
		door.setState(false);
	}
	@Override
	public boolean getStatus() {
		return false;
	}
	

}
