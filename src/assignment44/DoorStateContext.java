package assignment44;

public class DoorStateContext {
	
	private DoorState currentState;
	
	//doors will initiallize as open
	public DoorStateContext() {
		currentState = new DoorsOpen();
	}
	public void setState(boolean open) {
		if(open == false)
			currentState = new DoorClosed();
		else
			currentState = new DoorsOpen();
    }
	public void doorState() {
		currentState.doorStatus(this);
	}
	public boolean getState() {
		return currentState.getStatus();
	}
	
}
