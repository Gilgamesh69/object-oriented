package assignment4;

public class Elevator {
	boolean doorsOpen;
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
}
