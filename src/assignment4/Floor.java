package assignment4;

public abstract class Floor implements State{
	String floorName;
	boolean doorsOpen = false;
	boolean currentlyOn = false;
	
	public Floor() {
		
	}
	
	public void arrive() {
		System.out.println("Arriving at " + floorName);
	}
	/**
	 * prints if doors are open or not
	 */
	public void printDoorStatus() {
		if(doorsOpen) {
			System.out.println("Doors are open");
		}else {
			System.out.println("Doors are closed");
		}
	}
	public boolean isDoorsOpen() {
		return doorsOpen;
	}
	public void setDoorsOpen(boolean doorsOpen) {
		this.doorsOpen = doorsOpen;
	}
	public boolean isCurrentlyOn() {
		return currentlyOn;
	}

	public void setCurrentlyOn(boolean currentlyOn) {
		this.currentlyOn = currentlyOn;
	}

	

}
