package assignment44;

public class DoorsOpen implements DoorState{
	@Override
	public void doorStatus(DoorStateContext door) {
		System.out.println("Doors are open.");
		door.setState(true);
	}
	@Override
	public boolean getStatus() {
		return true;
	}
}
